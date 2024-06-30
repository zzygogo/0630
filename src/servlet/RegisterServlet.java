package servlet;

import com.xxxx.entity.User;
import db.DbConn;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        // 获取登录表单数据
        String username = request.getParameter("uname");
        String password = request.getParameter("upwd");
        int age = Integer.getInteger(request.getParameter("uage"));
        String job = request.getParameter("ujob");
        String tel = request.getParameter("utel");
        String email = request.getParameter("uemail");

        try {
            DbConn dbConn = new DbConn();
            Connection conn = dbConn.DbConn();

            String sql = "insert into t_user (username, userpassword, age, job, tel, email) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setInt(3, age);
            pstmt.setString(4, job);
            pstmt.setString(5, tel);
            pstmt.setString(6, email);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();
            response.sendRedirect("Login.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("SQL异常: " + e.getMessage());
        }

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}





