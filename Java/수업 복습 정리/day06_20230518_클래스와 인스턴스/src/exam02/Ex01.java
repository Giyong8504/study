package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id =1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        s1.showInfo();
        System.out.println("s1 = " + System.identityHashCode(s1)); //현재 객체주소 확인
        
        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";
        s2.showInfo();
        System.out.println("s2 = " + System.identityHashCode(s2));
        
        Student s3 = s2; //s3이 s2의 주소값이 대입
        s3.id = 1002;
        s3.name = "학생3";
        s3.subject = "과목3";
        s3.showInfo();




//        System.out.println(s1);
//        System.out.println(System.identityHashCode(s1));
        /**
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        */

    }
}
