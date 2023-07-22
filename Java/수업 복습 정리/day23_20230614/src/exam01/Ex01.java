package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

//@MyAnno(value={"값1","값2","값3","값4"}, min = 10, max = 100)
@MyAnno({"값1", "값2", "값3"})
public class Ex01 {

    public static void main(String[] args) {
        Class cls = Ex01.class;
        MyAnno myAnno = (MyAnno) cls.getAnnotation(MyAnno.class);

        String[] values = myAnno.value();
        System.out.println(Arrays.toString(values));

        int min = myAnno.min();
        int max = myAnno.max();
        System.out.printf("min=%d, max=%d%n", min, max);

    }
}
