package exam01;

import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {1,2,3,4,5};

        boolean matched = Objects.deepEquals(nums1, nums2); // 한꺼번에 배열의 값을 전부 비교해서 boolean 값으로 반환.
        System.out.println(matched);
    }
}
