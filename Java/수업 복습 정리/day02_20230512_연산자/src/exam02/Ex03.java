package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;

        //long num3 = num1 + num2; // int num1 -> long
        int num3 = (int)(num1 + num2); // int num1 -> long

        double num4 = 10.0; // 실수

        double num5 = num2 - num4; // long -> double

    }
}
