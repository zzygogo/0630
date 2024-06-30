package db;

import java.sql.*;

public class DbConn {
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/sys";
    String USER = "root";
    String PASS = "12313936108412";
    Connection conn = null;

    public Connection DbConn() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("成功连接数据库..");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败..");
        }
        return conn;
    }

    public static void main(String[] args) {
        DbConn dbconnection = new DbConn();
        dbconnection.DbConn();
    }


}
