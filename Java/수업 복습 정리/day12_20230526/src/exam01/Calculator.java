package exam01;

public interface Calculator {
    int num = 10;
    // public static final num = 10;
    int add(int num1, int num2); // public abstract
    // public abstract int add(int num1, int num2);

    default void commonMethod() {
        System.out.println("공통기능!");
    }
}

