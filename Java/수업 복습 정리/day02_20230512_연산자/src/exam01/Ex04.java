package exam01;

public class Ex04 {
    public static void main(String[] args) {
        byte num1 = 100; // 1바이트
        
        int num2 = num1; // 4바이트
        long num3 = num2; // 8바이트
        //작은 자료형 -> 큰자료형  자동으로 자료형이 변환 - 자동 형변환 // 묵시적 형변환

        System.out.println(num3);

        float num5 = num3;

        double num4 = num3; // 실수는 항상 정수보다 숫자의 표현범위가 넓다.
        System.out.println(num4);
    }
}
