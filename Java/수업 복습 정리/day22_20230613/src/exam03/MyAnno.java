package exam03;


import static java.lang.annotation.ElementType.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD}) // 배열일 때도 가능.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno { // extends
    String[] value() default {"값","값2"};
    int min() default 0;
    int max() default 0;


}
