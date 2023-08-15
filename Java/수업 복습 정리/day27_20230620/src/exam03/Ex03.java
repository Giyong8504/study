package exam03;

import java.io.File;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        String path = "D:" + File.separator + "tmp" + File.separator + "tmp1" + File.separator +
                "tmp2" + File.separator + ".." + File.separator + ".."; // ..은 상위로 이동하는거
        // D:\tmp\tmp1\tmp2\..\..  == D:\tmp
        File dir = new File(path);
        File file = new File(dir, "tmp1.txt");
        file.createNewFile();

        System.out.println("absolutePath : " + file.getAbsolutePath()); // D:\tmp\tmp1.txt
        System.out.println("canonicalPath" + file.getCanonicalPath()); // D:\tmp\tmp1.txt
    }
}
