package exam01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("data.txt"));
        while(sc.hasNext()){ //다음 라인이 있는 경우
            String line = sc.nextLine();
            System.out.println(line);
        }

        /**System.out.println(sc.hasNext()); // 다음칸에 데이터가 있으면 읽어온다.boolean 값이네?
        System.out.println(sc.nextLine());  //다음 문자열 1개 조회.

        System.out.println(sc.hasNext());
        System.out.println(sc.nextLine());

        System.out.println(sc.hasNext());
        System.out.println(sc.nextLine());

        System.out.println(sc.hasNext()); // 끝까지 읽으면 false 가나옴.*/


    }
}
