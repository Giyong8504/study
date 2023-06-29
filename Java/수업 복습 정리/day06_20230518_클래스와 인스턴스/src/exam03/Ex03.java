package exam03;

public class Ex03 {
    public static void main(String[] args) {


    }
    static int add(int num1, int num2) {
        int num3 = num1 + num2;

        return num3;

    }
    static double add(double num1, double num2) {
        //패키지명 + 클래스명 + 자료형 + 함수형 + 매개변수 정의 이 다 같아야 같은 함수.
        //아래 처럼자료형이 달라도 다른 함수가 된다.
        double num3 = num1 + num2;
        return num3;
    }
    static int add(int num1){
        return num1;
    }
    static int add(int num1, int num2, int num3) {
        int num4 = num1 + num2 + num3;
        return num4;
    }
}
