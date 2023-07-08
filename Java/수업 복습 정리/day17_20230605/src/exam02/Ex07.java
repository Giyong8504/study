package exam02;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex07 {
    public static void main(String[] args) throws ParseException {
        String msg = "사용자01(user01)님 로그인...."; // 추출할 수 있다.
        String pattern = "{0}({1})님 로그인....";// 형식대로 쪼개서 가져옴.

        MessageFormat mf = new MessageFormat(pattern);
        Object[] data = mf.parse(msg);
        String userNm = (String)data[0];
        String userId = (String)data[1];

        System.out.printf("userNm=%s, userId = %s%n",userNm,userId);


    }
}
