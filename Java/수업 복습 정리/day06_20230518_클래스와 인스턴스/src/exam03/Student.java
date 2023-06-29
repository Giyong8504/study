package exam03;

public class Student {
    int id; // 학번   //인스턴스변수, 멤버변수
    String name; //이름
    String subject;

    public Student() { //객체를 생성하기 위한 유일한 목적
         
        //생성자가 객체를 생성한 이후 작업
        //정의된 변수가 공간을 할당 받은 시점 이후
        id = 1000;
        name = "이름1";
        subject = "과목1";
    }
    public Student(int id2, String name2, String subject2){
        id = id2;
        name = name2;
        subject = subject2;

    }
    void showInfo(){  //인스턴스 메서드
        System.out.printf("id=%d, name=%s, subject=%s%n",id,name,subject);
    }

}
