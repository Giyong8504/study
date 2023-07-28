package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/madang?user=madang&password=madang";
        String url = "jdbc::mysql://localhost::3306/madang";
        String user = "madang", password="madang";

        try (
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement()) {
            String bookname = "책1";

            String sql = "INSERT INTO book2 VALUES (2, '" + bookname + "', '출판사2', 10000)";
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println(affectedRows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
