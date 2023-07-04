package exam01;

//import java.lang.*;  - 컴파일러가 자동 추가해주는 소스

public class Ex01 {
    public static void main(String[] args) {
        //java.lang.String str = "ABC";
//        String str = "ABC";
//        Object s1 = new Student(); //다형성으로 사용이 가능.
        Student s1 =new Student();
        System.out.println(s1.toString()); //Object::toString()
        System.out.println(s1); // s1.toString() 참조변수만 출력하면 자동으로 toString이 붙어서 나옴. 결론 11행과 12행 같음.

    }
}
