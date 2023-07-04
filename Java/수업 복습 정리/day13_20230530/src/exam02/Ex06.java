package exam02;

public class Ex06 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; //ArithmeticException 발생

            String str = null;
            str.toUpperCase(); //NullPointerException 발생
        }catch(ArithmeticException | NullPointerException e) {//catch를 여러개 안쓰는 방법 여러개 묶기가능.
            System.out.println(e.getMessage());
        }
    }
}
