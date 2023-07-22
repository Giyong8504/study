package exam02;

@FunctionalInterface
public interface Calculator {
    int add(int num1, int num2);
//    int minus(int num1, int num2);
//    람다식은 단일기능만 가능하기때문에 안된다. 매개변수가 동일해서 뭔지 인지를 못함. @FunctionalInterface 해보면 문제 판단.

}
