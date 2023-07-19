package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = (a,b) -> a + b;
        int result = cal.add(10,20);
        System.out.println(result);
    }
}