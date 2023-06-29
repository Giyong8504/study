package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println(result);

        int result2 = add(20,30);
        System.out.println(result2);

    }

    static int add(int num1, int num2) { // 투입되는 매개변수 값만 바뀜.
        int num3 = num1 + num2; //수행되는 정의는 바뀌지 않음.

        return num3;
    }
}
