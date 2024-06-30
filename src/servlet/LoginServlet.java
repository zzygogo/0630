package servlet;

import db.DbConn;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        // 获取登录表单数据
        String username = request.getParameter("uname");
        String password = request.getParameter("upwd");


        try {
            DbConn dbConn = new DbConn();
            Connection conn = dbConn.DbConn();

            String sql = "SELECT * FROM t_user WHERE username=? AND userpassword=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                request.setAttribute("username", rs.getString("username"));
                request.setAttribute("age", rs.getInt("age"));
                request.setAttribute("job", rs.getString("job"));
                request.setAttribute("tel", rs.getString("tel"));
                request.setAttribute("email", rs.getString("email"));
                request.getRequestDispatcher("Success.jsp").forward(request, response);
            } else {
                response.sendRedirect("Login.jsp");
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}





