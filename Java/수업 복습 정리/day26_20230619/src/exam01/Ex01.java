package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"이이름"));
        students.add(new Student(2,"김이름"));
        students.add(new Student(3,"박이름"));
        students.add(new Student(1,"최이름"));
        students.add(new Student(2,"김이름"));
        students.add(new Student(3,"정이름"));
        students.add(new Student(1,"김이름"));
        students.add(new Student(2,"박이름"));
        students.add(new Student(3,"최이름"));


//        Map<String, List<Student>> students2 = students.stream().collect(Collectors.groupingBy(Student::getBan);

//        List<Student> ban1 = students2.get(1);
//        List<Student> ban2 = students2.get(2);
//        List<Student> ban3 = students2.get(3);
//
//        System.out.println("-------1반-------");
//        ban1.forEach(System.out::println);
//
//        System.out.println("-------2반-------");
//        ban1.forEach(System.out::println);
//
//        System.out.println("-------3반-------");
//        ban1.forEach(System.out::println);

    }
}
