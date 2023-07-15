package exam02;

import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> names =new Vector<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Enumeration<String> enu = names.elements();
        while(enu.hasMoreElements()){
            String name = enu.nextElement();
            System.out.println(name);
        }
    }
}
