package exam02;

public class UserPwIncorrectException extends RuntimeException{ //유연하게 처리하는 것
    public UserPwIncorrectException(String message){
        super(message);
    }
}
