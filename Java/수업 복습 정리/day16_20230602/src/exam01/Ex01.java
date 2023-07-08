package exam01;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");

        System.out.printf("str1 : %d%n", System.identityHashCode(str1));
        System.out.printf("str2 : %d%n", System.identityHashCode(str2));
        System.out.printf("str3 : %d%n", System.identityHashCode(str3));
        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
    }
}
