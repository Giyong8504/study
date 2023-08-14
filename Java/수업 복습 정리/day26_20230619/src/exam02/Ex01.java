package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")){
            int i = 0;
            while ((i= fis.read()) != -1) {
                char ch = (char)i;
                System.out.print(ch);
            }

            /**int ch = fis.read();
            System.out.printf("ch=%d, %c%n",ch, (char)ch);

            ch = fis.read();
            System.out.printf("ch=%d, %c%n",ch, (char)ch);

            ch = fis.read();
            System.out.printf("ch=%d, %c%n",ch, (char)ch);
*/

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
