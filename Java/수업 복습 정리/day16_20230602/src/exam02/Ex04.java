package exam02;

public class Ex04 { // 이해못하고 있으면 문제
    public static void main(String[] args) {
        Integer num1 =  Integer.valueOf(100); //내부적으로 오토박싱
        Integer num2 =  200;
//        Integer num3 =Integer.valueOf(num1.intValue() +num2.intValue()); //언박싱
        Integer num3 = num1 + num2;
        System.out.println(num3);

    }
}
