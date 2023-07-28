# JDBC로 데이터베이스 연동
- JDBC(Java DataBase Connetivity) API(Application Progarmming Interface)
1. 순서
1)java.sql.* 패키지 임포트
2)JDBC 드라이버 로딩
- Class.forName(...) : 실행중에 동적으로 데이터에 올리는 역할

3)데이터베이스 접속을 위한 Connection 객체 생성
- DriverManager
	- .getCnnection(String url)

쿼리문을 실행하기 위한 4) Statement/PreparedStatement/CallableStatemnent 객체생성
쿼리 실행
5) 쿼리 실행 결과 값(int , ResultSet) 사용
6) 사용된 객체(ResultSet, Statement/PreparedStatement/CallableStatemnent, Connection) 종료


# 데이터베이스 쿼리실행
1. Statment
1) 정적인 쿼리에 사용
2) 하나의 쿼리를 사용하고 나면 더는 사용할 수 없다.
3) Statement 객체의 메서드 종류
	- ResultSet executeQuery(String sql);
		- SELECT 문과 같이 데이터 조회를 위한 쿼리
		- 반환값 ResultSet : 조회된 데이터를 위치를 가지고 있는 객체
		
		ResultSet
			
	- int executeUpdate(String sql)
		- INSERT, UPDATE, DELETE 와 같은 데이터 변경 관련 쿼리
		- 반영된 레코드 갯수
		
2. PreparedStatement
		
```java
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang", password="madang";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```