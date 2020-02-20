package com.web.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lzy on 2020/2/19.
 */
public class Connect {

    private static Connection connection;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/enwords?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(DRIVER);
                System.out.println("加载成功");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("链接成功");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return connection;
        }

        return connection;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        System.out.println(Connect.getConnection());
//    }
    /*
    测试代码
     */
  /*  public static void main(String[] args) {
    Connect c=new Connect();
    c.getConnection();
    }
   */
}