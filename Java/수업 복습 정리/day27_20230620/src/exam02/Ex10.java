package exam02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args ) throws IOException {
        Scanner sc = new Scanner(new File("score2.txt")); //스캐너를 가지고도 한줄한줄 편하게 읽어올 수 있다.
        while(sc.hasNextInt())  {
            int score = sc.nextInt();
            System.out.println(score);
        }
    }
}
