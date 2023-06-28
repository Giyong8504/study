package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 20231410;
        s1.name = "이이름";
        s1.subject = "자바";

        System.out.printf("id=%d, name=%s, subject=%s%n", s1.id,s1.name,s1.subject );

        s1.study();
    }
}
