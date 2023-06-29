package exam03;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        s1.showInfo();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject ="과목2";
        s2.showInfo();
        System.out.println(System.identityHashCode(s2));

        Student s3 = s2; //s3은 s2의 주소 값 저장

        System.out.println("s3 == s2 : " + (s3 == s2));
        System.out.println("s1 == s2 : " + (s1 == s2));

        s3.name = "학생3";
        s3.showInfo();
        s2.showInfo();
    }
}
