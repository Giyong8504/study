package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        s1.showInfo();

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";
        s2.showInfo();
        s1.showInfo();

    }
}
