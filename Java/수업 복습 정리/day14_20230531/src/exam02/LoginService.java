package exam02;

public class LoginService {
    public void login(String userId, String userPw) {
        // userId - user01, userPw - 1234
        if(!userId.equals("user01")) {
            throw new UserIdIncorrectException("아이디가 일치하지 않습니다.");
        }

        if(!userPw.equals("1234")){
            throw new UserPwIncorrectException("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("로그인 성공!");

    }
} //이렇게 형식이 유연함. 따로 명시하지 않아도 되네?
