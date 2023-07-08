package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String str = "ABC";
        str = str.concat("DEF"); //문자열 결합
        System.out.println(str);

        System.out.println("startsWith - A : " + str.startsWith("A")); //단어 시작체크
        System.out.println("startsWith - F : " + str.startsWith("F"));

        System.out.println("contains - BCD : " + str.contains("BCD")); //문자열 포함 여부 체크

        System.out.println(str.indent(5));//들여쓰기

    }

}
