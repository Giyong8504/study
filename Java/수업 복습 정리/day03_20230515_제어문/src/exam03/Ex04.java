package exam03;

public class Ex04 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 100; i++) {
            total += i;

            if(i == 50){
                break;
            }
        }
        System.out.printf("총합 = %d%n", total);
    }
}
