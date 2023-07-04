package exam02;

public class UserIdIncorrectException extends RuntimeException{
    public UserIdIncorrectException(String message){
        super(message);
    }
}
