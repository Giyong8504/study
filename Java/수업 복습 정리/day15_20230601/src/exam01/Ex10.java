package exam01;

import java.util.HashSet;

public class Ex10 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student(1000,"학생1", "과목1"));
        students.add(new Student(1000,"학생1", "과목1"));
        students.add(new Student(1001,"학생2", "과목2"));
        students.add(new Student(1002,"학생3", "과목3"));

        //객체의 동등성 비교 - equals(), hashCode().. 를 둘다 비교해서 맞아야 동일한 객체. 관례적, 규칙 반드시 해야됨.

        for(Student student : students){
            System.out.println(student);
        }
    }
}
