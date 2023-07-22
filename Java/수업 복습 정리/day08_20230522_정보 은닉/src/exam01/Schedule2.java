package exam01;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2() {// this 메서드를 통해 아래의 생성자의 메개변수 값을 가져와서 출력시 간결하게 사용가능
        this(2023, 5, 22);
//        year = 2023;
//        month = 5;
//        day = 22;
    }

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        this.getMonth(); //
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    void showInfo() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }

    public void printThis() {
        System.out.println(this);
    }
}