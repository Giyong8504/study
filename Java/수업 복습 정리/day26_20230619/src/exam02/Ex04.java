package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) { // buffer도 한번 사용해보자.
        try (FileOutputStream fos = new FileOutputStream("test2.txt")){ // 파일이 없을 때 파일이 새로 만들어짐
            for(int i = 0; i < 26; i++) {
                fos.write(i + 65);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
