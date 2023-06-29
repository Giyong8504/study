package exam02;

public class Student {
    int id;
    String name;
    String subject;

    public Student() {
        // 생성자가 객체를 생성한 이후 처리할 작업
        // 작업처리 시점, 멤버 변수에 공간이 할당된 상태
        id = 1000;
        name = "학생1";
        subject = "과목1";
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n",id ,name, subject);
    }

}
