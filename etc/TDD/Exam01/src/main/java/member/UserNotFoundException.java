package member;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("등록되지 않은 회원입니다.");
    }
}
