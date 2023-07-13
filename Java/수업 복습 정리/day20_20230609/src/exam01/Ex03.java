package exam01;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(5);
        System.out.println(nums.capacity());
        for(int i = 0; i < 5; i++){
            nums.add(i);

        } // 현재 공간은 5개!
        System.out.println(nums.capacity()); // 5개


        //기존 배열을 버리고 새로 만들어 늘린다!
        nums.add(5); // 6개째 추가!? : 기존 배열을 버리고 새로 두배 키워서 생성
        System.out.println(nums.capacity()); // 10개

    }
}
