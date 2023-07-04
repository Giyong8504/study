package exam01;

public class Ex05 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"학생1","과목1");
        Student s2 = new Student(1000,"학생1","과목1");

        System.out.println(s1 == s2); //동일성비교 다른객체, 다른 주소. false 나옴~
        System.out.println("s1.hashCode(): " +s1.hashCode());
        System.out.println("s2.hashCode(): " +s2.hashCode());
        System.out.println(s1.equals(s2)); //동등성 비교

        //리터럴 상수는 같은 주소값을 가지기 때문에 비교해보면 true;
//        int num1 = 10;
//        int num2 = 10;
//        System.out.println(num1 == num2); //값의 비교가 아니라 주소의 비교이다.****

    }
}
