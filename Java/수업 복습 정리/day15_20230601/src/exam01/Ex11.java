package exam01;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
//        add(10,20,30,40,50);
        int total1 = add(10,20,30,40,50);
        int total2 = add(10,20);

        System.out.printf("total1 = %d%n",total1);
        System.out.printf("total2 = %d%n",total2);

    }

//    public static int add(int...nums){ //이건 사실 배열이다~
//        System.out.println(Arrays.toString(nums));
//        return 0;
    public static int add(int...nums){
        int total = 0;
        for(int num : nums){
            total += num;
        }
         return total;
    }
}
