package exam01;

public class Ex03 {
    public static void main (String[] args) {
        int total =0, total2 = 0;

        for(int i = 1, j = 100; i <=100; i++, j--){

            total += i;
            total2 += j;

        }System.out.printf("총합1= %d, 총합2 = %d%n", total , total2);
    }
}
