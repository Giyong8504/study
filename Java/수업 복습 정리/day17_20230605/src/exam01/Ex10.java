package exam01;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        String str = "ABCabc";
        System.out.println("length() : " + str.length());
        char[] chars = str.toCharArray();// 문자를 배열로 바꾸는거
        System.out.println(Arrays.toString(chars));

        System.out.println("toLowerCase() : " + str.toLowerCase());
        System.out.println("toUpperCase() : " + str.toUpperCase());
        System.out.println("replace() : " + str.replace("ABC","abc"));
        System.out.println("substring(2) : " + str.substring(2));
        System.out.println("substring(2,4) : " + str.substring(2,4)); // 2, 3

    }
}
