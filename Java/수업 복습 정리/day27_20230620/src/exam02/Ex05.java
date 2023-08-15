package exam02;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) { //순서대로 같은 자료형 가지고 기본형태로 가질 수 있게 저장 할 수 있따.
        int[] scores = {90,80,88,65,78,100};
        try(FileOutputStream fos = new FileOutputStream("score.dat");
            DataOutputStream dos = new DataOutputStream(fos)){
            for(int score : scores){
                dos.writeInt(score);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
