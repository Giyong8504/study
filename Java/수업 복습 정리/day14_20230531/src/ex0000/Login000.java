package ex0000;

public class Login000 {
    public void login(String userId,String userPw){
        if(!userId.equals("user01")){
            throw new UserId("아이디 다르다고");
        }
        if(!userPw.equals("1234")){
            throw new UserPw("비번 다른데?");
        }
        System.out.println("성공했네?");
    }
}
