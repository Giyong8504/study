package exam03;

import java.io.File;

public class Ex04 {
    public static void main(String[] args) {
        File dir = new File("D:\\tmp");
        System.out.println("isDirectory : " + dir.isDirectory());

        File file = new File(dir, "tmp1.txt");
        System.out.println("isFile : " + file.isFile());

        File dir2 = new File("D:\\tmp\\tmp1_1\\tmp1_2\\tmp1_3");
        System.out.println("exists : " + dir2.exists());
        if(!dir2.exists()){
            dir2.mkdirs();
        }
    }
}
