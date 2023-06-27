package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 10;
        if(num == 10){
            System.out.println("10이다");
        }else{
            System.out.println("10이 아니다");
        }

        String str = num == 10 ? "10이다" : "10이 아니다.";
        System.out.println(str);
    }
}
