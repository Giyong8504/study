package exam02;

public class Ex05 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; //ArithmeticException 발생

            String str = null;
            str.toUpperCase(); //NullPointerException 발생
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
//catch 여러개 가능. (다중 예외처리가 가능)