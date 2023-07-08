package exam01;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb = " +System.identityHashCode(sb));

        sb.append("ABC");
//        System.out.println(sb.length());
        System.out.println("sb = " +System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println("sb = " +System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println("sb = " +System.identityHashCode(sb));




        //하나의 Buffer안에 담겨있어서 충분한 크기이면 주소가 동일하다. -> 메모리 관리가 좋다.

        String str = sb.toString(); //Buffer에 담아두었다가 마지막에 주소값이 변경되면서 반환해줌.
        System.out.println(str);
        System.out.println("str = " +System.identityHashCode(str));


    }
}
