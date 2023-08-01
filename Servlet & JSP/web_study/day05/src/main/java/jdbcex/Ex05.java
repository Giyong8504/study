package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang";
        String password = "madang";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall("CALL BookInsertOrUpdate(?,?,?,?);")) {
            cstmt.setInt(1, 30);
            cstmt.setString(2, "책30");
            cstmt.setString(3, "출판사30");
            cstmt.setInt(4, 20000);
            int affectedRows = cstmt.executeUpdate();
            System.out.println(affectedRows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}