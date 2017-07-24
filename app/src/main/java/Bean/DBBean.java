package Bean;

import java.sql.*;

/**
 * Created by diy on 2017-07-23.
 */

public class DBBean {
    private  static String driverName = "com.mysql.jdbc.Driver";
    private  static String dbURL = "jdbc:mysql://192.168.2.101:3306/db_schoolangel";
    private  static String userName = "root";
    private  static String userPwd = "root";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DBBean() {
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL, userName, userPwd);
            stmt = conn.createStatement();
            System.out.println("成功同数据库建立连接！ ");
        } catch (Exception ex) {
            System.out.println(" 无法同数据库建立连接！"+ex.getMessage());
        }
    }
    /*static {
        try {
            System.out.println("4");
            Class.forName(driverName);
            System.out.println("1");
            conn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("2");
            stmt = conn.createStatement();
            System.out.println("成功同数据库建立连接！");
        } catch (Exception ex) {
            System.out.println("无法同数据库建立连接！"+ex.getMessage());
        }
    }*/

    public int executeUpdate(String s) {
        int result = 0;
        try {
            result = stmt.executeUpdate(s);
            System.out.println("执行更新正确！");
        } catch (Exception ex) {
            System.out.println("执行更新错误！"+ex.getMessage());
        }
        return result;
    }

    public ResultSet executeQuery(String s) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(s);
            System.out.println("执行查询正确！");
        } catch (Exception ex) {
            System.out.println("执行查询错误！"+ex.getMessage());
        }
        return rs;
    }

    public void close() {
        try {
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("数据库连接关闭错误！"+e.getMessage());
        }
    }
}
