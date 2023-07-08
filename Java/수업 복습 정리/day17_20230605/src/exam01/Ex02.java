package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i <10; i++){
            int rand = random.nextInt();
            System.out.println(rand);
        }
    }
}
