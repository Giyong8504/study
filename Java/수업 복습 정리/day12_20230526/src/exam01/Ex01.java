package exam01;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Calculator.num);

        Calculator cal = getCalculator(); // SimpleCalculaltor, ComplexCalculator
        int result = cal.add(10, 20);
        System.out.println(result);
    }

    private static Calculator getCalculator() {

        //return new SimpleCalculator();
        return new ComplexCalculator();
    }
}
