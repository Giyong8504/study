package exam01;

public class Ex05 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //전가 했으면 여기서 꼭 처리해줘야함.

        try{
            service.login("user02", "1235");

            System.out.println("로그인 이후 실행될 아주 중요한 코드!!!, 로그인 안되면 절대 실행 X");
        }catch(UserIdIncorrectException | UserPwIncorrectException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        // 전가시켜서 외부에서 처리하도록 만드는 것.

    }
}
