package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num = 10;

        String str = num == 10 ? "10이다." : "10이 아니다.";

        System.out.println(str);

        boolean result = true;
        System.out.printf("result = %s%n", !result);
    }
}
