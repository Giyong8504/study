package exam02;

public abstract class Calculator {

    int num = 10;

    public abstract int add(int num1, int num2);

    public int minus(int num1, int num2){
        int result = num1 - num2;
        return result;

    }
}
