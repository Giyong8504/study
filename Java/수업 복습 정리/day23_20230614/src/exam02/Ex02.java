package exam02;

public class Ex02 {
    public static void main(String[] args) {
//        Calculator cal = (a,b) -> a + b;
//        int result = calc(cal,10,20);
        int result = calc((a, b) -> a + b, 10, 20);


        /**
        int result = calc(new Calculator() { //이렇게 정의해서 많이 썼지만 짧게 쓰기 위해 람다식을 사용하게 됨.
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        }, 10, 20)
            */

        System.out.println(result);

    }
    public static int calc(Calculator cal,int num1, int num2){
        return cal.add(num1,num2);
    }
}
