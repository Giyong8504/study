package exam04;

public class ImplCalculator implements Calculator{
    @Override //finally는 return이나 catch를 하지 않아도 무조건 실행
    public long factorial(long num) {

long total = 1L;
        for(int i = 1; i <= num; i++){
            total *= i;
        }
        return total;
    }

}
