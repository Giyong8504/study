package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex01 {
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



        /**
        //이미 정의되어있음 - 있는거 쓰자
        List<String> names = students.stream().map(Student::getName)
                .collect(Collectors.toList()); // 이름만 뽑아온 상태
        System.out.println(names);
        */


        List<String> names = students.stream().map(Student::getName).toList();
        System.out.println(names);

        Set<String> names2 = students.stream().map(Student::getName)
                .collect(Collectors.toSet());
        System.out.println(names2);

        ArrayList<String> names3 = students.stream().map(Student::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names3);
    }
}
