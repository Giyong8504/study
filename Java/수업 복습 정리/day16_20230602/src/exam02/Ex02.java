package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 100;
        //Integer num2 = num1; //Integer num2 = Integer.valueOf(num1); 자동으로 바꿔줘서 가능함.
        Integer num2 = Integer.valueOf(num1); //기본형 -> 객체

        Integer num3 = new Integer(300);
        //int result = num1 + num3 // int + Integer
        int result = num1 + num3.intValue(); //컴파일러가 자동 변환
        System.out.println(result);

    }
}
