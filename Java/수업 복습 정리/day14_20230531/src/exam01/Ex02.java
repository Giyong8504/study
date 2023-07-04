package exam01;

public class Ex02 {
    public static void main(String[] args) {
       try {
           int num1 = 100;
           int num2 = 0;

           int result = num1 / num2; //throw new ArithmeticException 이 발생함!
           System.out.println(result);

           String str = null;
           str.toUpperCase(); //throw new NullPointerException(...)
       }catch (ArithmeticException | NullPointerException e) {
           System.out.println(e.getMessage());
           System.out.println("유입1");

       }
    }
}
