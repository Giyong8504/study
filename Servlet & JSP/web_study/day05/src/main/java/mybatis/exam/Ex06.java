package mybatis.exam;

import models.Users;
import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
        Users params = new Users();
        params.setUserId("%user%");
        params.setUserNm("%사용자%");

        List<Users> users = sqlSession.selectList("UserMapper.users", params);
        users.stream().forEach(System.out::println);
    }
}
