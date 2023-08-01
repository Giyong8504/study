package mybatis.exam;

import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

public class Ex04 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
        long total = sqlSession.selectOne("UserMapper.total");
        System.out.println(total);
    }
}