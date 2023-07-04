package exam02;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        service.login("user01", "1235");

        System.out.println("로그인 이후 매우 중요한 실행코드..");
    }
} 
