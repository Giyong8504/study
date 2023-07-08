package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int result = add(10,12.345);
        int result2 = add(10.23F, 10);
        System.out.println(result);
        System.out.println(result2);

    }
    public static int add(Number num1, Number num2){ //숫자를 잘모를 때 Integer의 상위 클래스인 Number을 사용한다.
        //intValue로 변환해서
        int result = num1.intValue() + num2.intValue();
        return result;

    }
}
