package exam01;

public class Ex01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = add(num1,num2);

        int num3 = getNumber();
        System.out.println(num3);

        printNumber(100);
    }

    static int add(int num1, int num2) { // 함수 지역 변수
        int num3 = num1 + num2;
        return num3;
    }
    static int getNumber() {
        return 10;
    }
    static void printNumber(int num) {
        System.out.println(num);
    }
}
