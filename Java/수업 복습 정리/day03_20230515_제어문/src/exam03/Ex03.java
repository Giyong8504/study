package exam03;

public class Ex03 {
    public static void main(String[] args) {

        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while(num < 1);

        System.out.printf("총합 = %d%n", total);
    }
}
