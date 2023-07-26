package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int [] nums = {1,3,5,7,9,11};
        boolean matched1 = Arrays.stream(nums).allMatch(n -> n % 2 == 1); // 다 참이어야 참
        System.out.println(matched1);

        int [] nums2 = {1,2,4,6,8,10};
        boolean matched2 = Arrays.stream(nums2).anyMatch(n -> n % 2 ==1 );
        System.out.println(matched2);

        //for문으로 표현 예제 생략.

        int [] nums3 = {2,4,6,8,10};
        boolean matched3 = Arrays.stream(nums3).noneMatch(n -> n %2 ==1);
        System.out.println(matched3);

        Random rand = new Random();
        int r = rand.ints().filter(n-> n%2 ==1 ).findFirst().getAsInt();
        //랜덤이지만 홀수의 수 중에 첫번째 값만 나오게 하는거. 근데 Optional 이 들어감.
        System.out.println(r);

    }
}
