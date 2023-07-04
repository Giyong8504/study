package exam01;

import java.util.Objects;

public class Student { //항상 적용됨.
    private int id;// 학번
    private String name; // 이름
    private String subject; //전공과목

    public Student() {
    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

//    @Override
//    public String toString() {  //멤버변수의 값을 확인하는 용도로 주로쓰임.
//        return "id = " + id + ", name = " + name + ", subject = " + subject;
    // 이게 있지만 개발자들이 많이 써서 이미 정의되어있음.
//    }


    @Override
    public String toString() { //주로 값들을 확인할 때 사용.
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student)obj;
            if(student.id == id && student.name.equals(name) && student.subject.equals(subject)) {
                return true;

            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(id,name,subject);
        return hash;
        //자동완성으로 만들어주긴하는데 equals() hashCode() 는 꼭 써서 같은 객체를 합집합 처럼 처리해야됨.
    }
}
