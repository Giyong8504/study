package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
         int[][] nums = { {10,20,30}, {40,50,60} };

        /**
        int[][] nums = new int[2][3];
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;
        */
//        System.out.println(Arrays.deepToString(nums));

        System.out.println("행의 갯수 : " + nums.length);
        System.out.println("열의 갯수" + nums[0].length);

        for(int i = 0; i < nums.length; i++) { // 0,1
            for(int j = 0; j < nums[i].length; j++) { //열
                System.out.printf("%d행, %d열 = %d%n", i, j, nums[i][j]);
            }

        }

    }
}
