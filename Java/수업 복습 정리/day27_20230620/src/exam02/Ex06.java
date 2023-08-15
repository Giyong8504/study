package exam02;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        int total = 0, avg = 0, cnt = 0;
        try(FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)) {
            try {
                while (true) {
                     int score = dis.readInt();
                    total += score;
                    cnt++;
                    System.out.println(score);
                }

            } catch (EOFException e) {
                avg = Math.round(total/cnt);
                System.out.printf("total=%d , avg =%d, cnt = %d%n",total, avg, cnt);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
