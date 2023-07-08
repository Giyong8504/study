package exam01;

public class Ex09 {
    public static void main(String[] args) {
        String str = String.format("%d + %d = %d",10,20,30);
        System.out.println(str);

        String fruits = String.join(",", "Apple", "Orange", "Mango","Melon");
        System.out.println(fruits); //문자열 결합
    }
}
