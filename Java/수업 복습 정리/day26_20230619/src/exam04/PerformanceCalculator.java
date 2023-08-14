package exam04;

public class PerformanceCalculator implements Calculator{

    private Calculator calculator; // 계산기 기능이 아니라 시간 기능을 덧붙이는거.
    public PerformanceCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {

            return result = calculator.factorial(num); // 핵심기능
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n" ,etime - stime); //추가 기능
        }
    }
}
