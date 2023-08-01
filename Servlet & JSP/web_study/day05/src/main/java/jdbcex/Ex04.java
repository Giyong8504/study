package jdbcex;

import java.sql.*;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang";
        String password = "madang";
        String sql = "INSERT INTO Book2 (bookname, publisher, price) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bookid"})) {
            pstmt.setString(1, "책1");
            pstmt.setString(2, "출판사1");
            pstmt.setInt(3, 20000);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) { // 쿼리 수행 성공
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int bookid = rs.getInt(1);
                    System.out.println("추가된 도서 번호(bookid) : " + bookid);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}