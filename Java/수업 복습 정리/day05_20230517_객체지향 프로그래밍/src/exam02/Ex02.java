package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int result = calc(3); // 함수를 호출한다.
        System.out.println(result);
    }

    static int /**반환 값 자료형 */ calc(int x){ //x = 3 - 매개변수
        // 실행 코드 정의
        int y = x * 2 + 1;

        return y; // 반환 값
    }

}
