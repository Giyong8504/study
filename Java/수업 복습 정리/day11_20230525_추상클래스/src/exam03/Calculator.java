package exam03;

public interface Calculator {
    int NUM = 10; // public static final num = 10 -> 정적 상수
    int add(int num1, int num2); // 기본적으로 public abstract 가 이미 정의 되어있어 생략됨.

    default int minus(int num1, int num2){
        privateMethod();
       // num = 20;
        int result = num1 - num2;
        return result;
    }

    public static void staticMethod() {
        System.out.println("정적 메서드 호출");
    }
    private void privateMethod() { //내부적으로 쓰기 위해.
        System.out.println("Private Method!");
    }

}
