package exam02;

public class Ex06 {
    public static void main(String[] args) {
        int num = 10;
        //Integer integer = Integer.value(10);
        Integer integer = num; // 오토박싱

        Integer num2 = Integer.valueOf(100);

//        int num3 = num + num2.intValue(); 
        int num3 = num + num2;   // num2.intValue(); 내부에서 언박싱
    }
}
