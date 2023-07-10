package exam01;

import java.time.LocalDate;

public class Ex03 {
    public static void main(String[] args) {
//        LocalDate localDate = new LocalDate(); 생성자가 없음.
        LocalDate date1 = LocalDate.of(2022,6,7); //내가 시간바꾸기
        LocalDate date2 = LocalDate.now(); // 지금시간!
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
