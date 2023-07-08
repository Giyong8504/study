package exam01;

public class Ex04 {
    public static void main(String[] args){//문자를 만들 때마다 객체가 생성되고 삭제한다. -> 성능저하
        String str = "ABC";
        System.out.println("str = "+System.identityHashCode(str));

        str += "DEF";
        System.out.println("str = "+System.identityHashCode(str));

        str += "GFI";
        System.out.println("str = "+System.identityHashCode(str));
    }
}
