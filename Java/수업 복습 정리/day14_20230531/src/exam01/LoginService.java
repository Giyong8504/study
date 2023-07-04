package exam01;

public class LoginService {
    public void login(String userId, String userPw) throws UserIdIncorrectException,
            UserPwIncorrectException{ //이게 바로 예외 미루기
        // userId = user01, userPw = 1234

        if (!userId.equals("user01")) {
            throw new UserIdIncorrectException("아이디가 일치 하지 않습니다."); //불일치할때만 던짐.

            //예외가 발생하지 않으면 아이디가 일치
        }

        if (!userPw.equals("1234")) {
            throw new UserPwIncorrectException("비밀번호가 일치하지 않습니다.");

            //예외가 발생하지 않으면 비밀번호가 일치
        }
        System.out.println("로그인 성공!");
    }
}


