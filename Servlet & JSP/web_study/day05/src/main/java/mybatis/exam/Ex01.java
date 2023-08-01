package mybatis.exam;

import models.Users;
import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

public class Ex01 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
        Users user = new Users();
        user.setUserId("user04");
        user.setUserPw("12345678");
        user.setUserNm("사용자04");
        user.setEmail("user04@test.org");
        user.setMobile("01000000000");

        int affectedRows = sqlSession.insert("UserMapper.insertUser",user);
        System.out.println(affectedRows);
        System.out.println(user);

        sqlSession.commit();
    }
}
