package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;

        //단락회로평가
        //연산이 어짜피 참이라  "++num > 10" 뒤쪽에는 연산하지 않는다.
        //그래서 연산하지 않고 값이 11 이 나옴
        boolean result = ++num > 10 || (num = num + 10) > 10;
        System.out.printf("num = %d%n", num);

//        boolean result2 = ++num > 12 || (num = num + 10) > 10;
//        System.out.printf("num = %d%n", num);

        int num2 = 10;

        boolean result2 = ++num2 > 20 && (num2 = num2+ 10) < 30;
        System.out.printf("num2 = %d%n", num2);





    }

}
