package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Integer num1 = new Integer(100); //JDK12 부터 문제가 발생함.
        Integer num2 = new Integer(100);
        System.out.println("num1 : " + System.identityHashCode(num1));
        System.out.println("num2 : " + System.identityHashCode(num2));


        //어짜피 정수 100을 가지고 연산을하면 결과 값이 동일하기 때문에 객체를  또 생성하지 말라고 하는것.
        //아래를 보면 주소가 같은 것으로 나오며 같은 값을 공유하여 사용한다.
        //메모리에 더 좋음.
        Integer num3 = Integer.valueOf(100);// 이걸로 쓰라고 바뀜. 더 바람직함
        Integer num4 = Integer.valueOf(100);
        System.out.println("num3 : " + System.identityHashCode(num3));
        System.out.println("num4 : " + System.identityHashCode(num4));
        // 많이쓰는 숫자는 동일하게 해주고 (100000000) 해보면 됨.
        // 큰 숫자는 새로운 객체를 생성함.


    }
}
