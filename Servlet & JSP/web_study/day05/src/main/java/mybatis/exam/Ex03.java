package mybatis.exam;

import models.Users;
import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

public class Ex03 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();

        Users params = new Users();
        params.setUserId("user03");

        Users user = sqlSession.selectOne("UserMapper.user", params);
        System.out.println(user);
    }
}