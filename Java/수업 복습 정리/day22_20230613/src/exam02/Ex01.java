package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans =  Transportation.TAXI;
        String name = trans.name();
        int ordinal = trans.ordinal(); //배열 순서마냥 상수의 위치를 반환해줌!
        System.out.printf("name =%s, ordinal = %d%n",name, ordinal);

//        Transportation trans2 = Enum.valueOf(Transportation.class,"BUS");//Enum 클래스의 값에 Transportation.class있는 BUS를 찾아줘
        Transportation trans2 = Transportation.valueOf("BUS");
        System.out.println(trans2);
    }
}// 상수는 주소가 하나이므로 == 로 비교를 한다. 동일한주소 동일한 객체이기 떄문.
