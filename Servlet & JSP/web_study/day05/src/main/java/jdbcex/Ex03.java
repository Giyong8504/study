package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang", password = "madang";
        String sql = "INSERT INTO book2 VALUSE (?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,3);
            pstmt.setString(2,"책3");
            pstmt.setString(3,"출판사");
            pstmt.setInt(4, 20000);
            int affectedRows = pstmt.executeUpdate();
            System.out.println(affectedRows);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
