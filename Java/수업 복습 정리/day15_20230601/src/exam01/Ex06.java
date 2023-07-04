package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1 == str2); //false 다른주소의 객체이기 때문, 동일성 비교시 같은 객체가 아님.
        System.out.println(str1.equals(str2)); // true 동등성 비교 - 같은 값이면 동등함.
        System.out.println("str1 : "+System.identityHashCode(str1)); //identityHashCode 주소값 확인 메서드.
        System.out.println("str2 : "+System.identityHashCode(str2));


    }
}
