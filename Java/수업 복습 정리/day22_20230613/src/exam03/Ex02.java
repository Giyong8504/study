package exam03;


import java.lang.annotation.Annotation;
import java.util.Arrays;
//배열일때는 여러개 설정가능함
//속성을 여러개 입력할 때는 value 를 생략할 수 없다.
@MyAnno(value = {"값3","값4"}, min = 10, max = 100)
public class Ex02 {
    public static void main(String[] args) {
        Class cls = Ex02.class;

        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
        int min = anno.min();
        int max = anno.max();
        System.out.printf("min = %d, max = %d%n",min,max);
        //String value = anno.value();
        //System.out.println(value);

    }
}
