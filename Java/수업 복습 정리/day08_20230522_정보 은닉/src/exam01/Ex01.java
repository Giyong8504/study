package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();

        //통제 불가
//        s1.year = 2023;
//        s1.month = 2;
//        s1.day = 31;

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showInfo();


    }
}
