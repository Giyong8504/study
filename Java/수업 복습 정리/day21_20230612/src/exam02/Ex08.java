package exam02;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6}};
//        System.out.println(Arrays.toString(nums)); 1차 배열 일때 확인.
        System.out.println(Arrays.deepToString(nums)); //2차원 이상 배열 확인 시 사용.
    }
}
