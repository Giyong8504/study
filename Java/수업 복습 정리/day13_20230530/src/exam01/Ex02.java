package exam01;

public class Ex02 {
    public static void main(String[] args) {
        //1. main 메서드의 지역이기 때문에 인터페이스를 만들어도 상관없네?
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {//2. 미구현된 메서드를 구현
                return num1 + num2;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);
    }
}
