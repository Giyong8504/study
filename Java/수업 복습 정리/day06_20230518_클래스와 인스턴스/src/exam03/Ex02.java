package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1001;
        s1.showInfo();

        Student s2 = new Student(1002, "이름2", "과목2");
        s2.showInfo();

        s2 = null; //null 값을 넣으면 참조가 끊김.

    }
}
