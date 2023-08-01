package mybatis.exam;

import models.Users;
import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
        Users user = new Users();
        user.setUserId("user02");
        user.setUserNm("(수정2)사용자02");
        //user.setEmail("(수정)user02@test.org");
        //user.setMobile("01010000000");

        sqlSession.update("UserMapper.update", user);

        // Users params = new Users();
        // params.setUserId("user03");
        //sqlSession.delete("UserMapper.delete", params);

        sqlSession.commit();

        List<Users> users = sqlSession.selectList("UserMapper.users");
        users.stream().forEach(System.out::println);
    }
}