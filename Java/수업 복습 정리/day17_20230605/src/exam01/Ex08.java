package exam01;

public class Ex08 {
    public static void main(String[] args) {
//        String str = "";
//        System.out.println("isEmpty : " + str.isEmpty());//빈값인지 체크!
        String str = " ";
        System.out.println("isEmpty : " + str.isEmpty());//빈값인지 체크!

        String str2 = "    ";
        System.out.println("inBlank :  " + str.isBlank());  //빈 값이 있으면 true 체크!
        System.out.println("trim().isEmpty() : " + str.trim().isEmpty()); // 예전에 쓰던 방법이지만 JDK11이후 추가됨

        String str3 = "     ABC    ";
        System.out.println("trim() : " + str3.trim());

    }
}
