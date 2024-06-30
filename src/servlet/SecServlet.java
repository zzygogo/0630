package servlet;

import db.DbConn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SecServlet")
public class SecServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String newpassword = request.getParameter("newpassword");

        DbConn dbConn = new DbConn();
        Connection conn = dbConn.DbConn();

        try {
            String sql = "UPDATE t_user SET userpassword=? WHERE username=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newpassword);
            pstmt.setString(2, username);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

            response.sendRedirect("Login.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("SQL异常: " + e.getMessage());
        }
    }
}