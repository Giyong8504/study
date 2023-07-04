package exam01;

public class Ex01 {
    public static void main(String[] args) {
        try {
        int num1 = 100;
        int num2 = 0;

            int result = num1 / num2; //throw new ArithmeticException 이 발생함!
            System.out.println(result);

        }catch (ArithmeticException e) { //ArithmeticException e = new ArithmeticException(...)
            System.out.println("예외 처리..");
//            String message = e.getMessage();
//            System.out.println(message);
            e.printStackTrace();

        }
        System.out.println("매우 중요한 실행 코드...");
    }
}
