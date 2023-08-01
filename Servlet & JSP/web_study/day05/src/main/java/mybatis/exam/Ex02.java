package mybatis.exam;

import models.Users;
import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
        List<Users> users = sqlSession.selectList("UserMapper.users");

        users.stream().forEach(System.out::println);
    }
}
