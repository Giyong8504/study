package ex1234;

public class LoginService {
    public void login(String userId,String userPw) throws UserIdCorrectException, UserPwCorrectException{
        if(!userId.equals("user01")){
            throw new UserIdCorrectException("아이디 틀렸어!!");
        }
        if(!userPw.equals("1234")){
            throw new UserPwCorrectException("비밀번호 틀렸어!!");
        }
        System.out.println("아이디 비번 다 맞췄네? 로그인~");
    }
}
