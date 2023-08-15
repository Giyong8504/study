package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        System.out.print("아무거나 입력 : ");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
//            char ch = (char)System.in.read();
//            char ch = (char)br.read();
//            System.out.print(ch);
            String line = br.readLine();
            System.out.println(line); // 이렇게하면 문자 형변환도 없이 한꺼번에 잘 읽어옴. (더욱 효율적!)
        }

    }

}
