package ex1234;

public class Maind01 {
    public static void main(String[] args) {
        LoginService login = new LoginService();
        
        try {
            login.login("user01", "1235");
        }catch(UserIdCorrectException | UserPwCorrectException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }

}
