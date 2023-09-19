package models.member;

public class DuplicateUserIdException extends RuntimeException {
    public DuplicateUserIdException() {
        super("이미 가입된 아이디 입니다.");
    }
}
