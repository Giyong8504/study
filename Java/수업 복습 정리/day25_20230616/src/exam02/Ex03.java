package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"이이름",'F'));
        students.add(new Student(2,"이이름",'M'));
        students.add(new Student(3,"이이름",'F'));
        students.add(new Student(1,"김이름",'M'));
        students.add(new Student(2,"김이름",'F'));
        students.add(new Student(3,"김이름",'M'));
        students.add(new Student(1,"박이름",'F'));
        students.add(new Student(2,"박이름",'M'));
        students.add(new Student(3,"박이름",'F'));

        Map<Boolean, List<Student>> students2 =
                students.stream().collect(Collectors.partitioningBy(s -> s.getGender() == 'F'));
        List<Student> females = students2.get(true);
        List<Student> males = students2.get(false);

        System.out.println("여성 학생");
        females.stream().forEach(System.out::println);

        System.out.println("남성 학생");
        males.stream().forEach(System.out::println);
    }
}
