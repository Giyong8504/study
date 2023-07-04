package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) {
        Class cls1 = Student.class; //객체 생성하지 않아도 확인가능.

        Field[] fields = cls1.getFields(); //멤버변수 조회
        for(Field field : fields){
            System.out.println(field);
        }

        Method[] methods = cls1.getMethods(); //메서드 조회
        for(Method method : methods) {
            System.out.println(method);
        }

        Constructor[] constructors = cls1.getConstructors(); //생성자 목록 조회
        for(Constructor constructor : constructors) {
            System.out.println(constructor);
        }
//        Student s1 = new Student();
//        Class clas2 = s1.getClass(); //내부의 상태정보 확인 할때 많이 사용.
    }
}
