package exam01;


public class Ex03 {
    public static void main(String[] args) {
        // main 메서드 지역 내부 (1)
        int num3 = 30; //main 메서드의 지역변수 num3

        Calculator cal = new Calculator(){
            public int add(int num1, int num2){ // 미구현된 메서드 구현(2)
                // num3이 제거되면 연산X // -> 제거 되지 않는 방식으로 변경
                // num3 상수화를 통해 데이터 영역 유지
                // num3 -> final int num3
                //num3 = 40;// -> 컴파일러가 final을 자동 추가
                return num1 + num2 + num3;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);

    }
}
