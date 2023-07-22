package exam01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;




@Target({ElementType.TYPE,ElementType.METHOD}) //범위를 설정할 수 있다.
@Retention(RetentionPolicy.RUNTIME) //우린 할수 없음. 오라클꺼
public @interface MyAnno { //이거만해도 다형성을 활용할 수 있느 ㅎ형태
    String [] value();
    int min() default 0;
    int max() default 0;

    
    
}
