package exam09;

public class Outer {

    Calculator cal = new Calculator() {
        public int add(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }
    };

    public void method() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                int result = num1 + num2;
                return result;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
