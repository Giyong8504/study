package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        Calculator cal2 = (a, b) -> a + b;

        int result = cal.add(10,20);
        int result2 = cal2.add(10,20);
        System.out.printf("result = %d, result2 = %d",result, result2);


    }
}
