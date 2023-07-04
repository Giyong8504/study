package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str1 = "ABC"; //같은 가치가 있는 값은 하나로 공유함~
        String str2 = "ABC";
        String str3 = new String("ABC");

        System.out.println("str1 : " +str1.hashCode());
        System.out.println("str2 : " +str2.hashCode());
        System.out.println("str3 : " +str3.hashCode());


        boolean result = isSame(str1, str2);
        System.out.println(result);

        boolean result2 = isSame(str1, str3);
        System.out.println(result2);

    }

//    public static boolean isSame(String str1, String str2) { // 이건 객체가 다르기 때문에 false가 나옴.== <-- 이건 객체주소 비교.
//        return str1 == str2;
//    }
    public static boolean isSame(String str1, String str2) { // 이건 동등성 비교. 가치가 같은 비교
        return str1.equals(str2);
    }
}
