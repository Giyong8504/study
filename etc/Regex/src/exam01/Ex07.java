package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Melon,Banana";
        if (fruits.matches(".*(Orange|Melon).*")) {
            System.out.println("포함!");
        }
    }
}
