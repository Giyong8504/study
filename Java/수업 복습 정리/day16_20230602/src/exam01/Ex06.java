package exam01;

public class Ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
//        StringBuffer sb2 = sb.append("ABC");
//        StringBuffer sb3 = sb2.append("DEF");
//        StringBuffer sb4 = sb3.append("GHI");

        sb.append("ABC").append("DEF").append("GHI");
        //메서드 체이닝 : StringBuffer 을 반환하기때문에 계속해서 연결할수 있다. (연결해서 쓰는거)

        String str = sb.toString();
        System.out.println(str);
    }
}
