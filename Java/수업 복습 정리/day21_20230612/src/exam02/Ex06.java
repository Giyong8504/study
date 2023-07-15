package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int [] nums = new int[10];

        Arrays.fill(nums,1);


// 배열을 출력하면 주소값만 나오는데 Arrays.toString()을 가지고 쉽게 값을 알아볼수 있다.
        System.out.println(Arrays.toString(nums));

        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {1,2,4,5,6};
        int index = Arrays.mismatch(nums1,nums2);
        System.out.println(index);

    }
}
