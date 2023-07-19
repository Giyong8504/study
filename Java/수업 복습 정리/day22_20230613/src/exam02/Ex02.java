package exam02;

import static exam02.Transportation.*; // 양이많을 때 임포트 해서 사용해도 가능하다! Enum에서.

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = BUS;

//        Transportation trans2 = Transportation.valueOf("BUS");
//        System.out.println(trans == trans2); // 상수는 주소가 하나이므로 == 로 비교를 한다. 동일한주소 동일한 객체이기 떄문.

        switch(trans){ //이미 시스템 값을 가지고 어떤 것인지 알기 때문에 상수만 가져와 사용한다.
            case BUS :
                System.out.println("버스!");
                break;
            case SUBWAY :
                System.out.println("지하철");
                break;
            case TAXI :
                System.out.println("택시");
                break;
        }

    }
}
