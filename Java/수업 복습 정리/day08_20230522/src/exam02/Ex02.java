package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 1000; //공간이 이미 활성화 되어있어 객체 만들지 않고 바로 사용가능.
        System.out.println(Student.id);
        Class cls = Student.class;

        Student.staticMethod();
    }
}
