package exam01;

public class Ex04 {
    public static void main (String[] args) {
        int total = 0;
        for(int i = 1; i <= 100; i++) {
            //홀수를 건너띄면(continue) 짝수

            if(i % 2 == 1) {
                continue;
            }
            total += i; // 짝수만 더하기
            
            /**
            if(i % 2==0){ //짝수(2로 나눈 나머지 0)
                total += i;
                
            }
             */



            /**
            if(i == 50){
                break; //반복 멈춤
            }
             */

        }
        System.out.printf("총합 = %d%n", total);
    }
}
