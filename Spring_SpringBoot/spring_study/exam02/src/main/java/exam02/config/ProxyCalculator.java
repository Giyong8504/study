package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import javax.swing.text.html.StyleSheet;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution( * exam02.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable { // 공통 기능을 수행할 내용을 정의
        
        long stime = System.nanoTime(); // 추가 공통 기능
        try{
            Object result = joinPoint.proceed(); // 핵심 기능 수행 : factorial(..)

            return result;
        }finally {
            long etime = System.nanoTime(); // 추가 공통 기능
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
        
        
        
    }
}
