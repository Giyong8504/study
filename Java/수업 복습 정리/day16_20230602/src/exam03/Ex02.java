package exam03;

public class Ex02 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
//            double num = Math.random() * 3; //*3을 하면 0,1,2 <--맨 앞숫자가
            int num = (int)(Math.random() * 45 + 1); // 0~44 // 1~45
            System.out.println(num);
        }
    }
}
