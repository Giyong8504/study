package exam04;

public class Ex01 {
    public static void main(String[] args) {

        ImplCalculator cal1 = new PerformanceCalculator(new ImplCalculator());
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10); // 핵심 기능

        System.out.printf("call : %d%n", result1);



        Calculator cal2 = new PerformanceCalculator(new RecCalculator());
        RecCalculator cal2 = new RecCalculator(); //재귀
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 : %d%n",result2);



    }
}
