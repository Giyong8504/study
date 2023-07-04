package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println(result);
        }catch(ArithmeticException e) {
            System.out.println("매우 중요한 코드 수행!!!"); //오류가 생겨도 중단되지 않고 계속 진행되어야 한다.
        }
    }
}