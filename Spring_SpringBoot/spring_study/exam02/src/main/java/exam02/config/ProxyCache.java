package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class ProxyCache {

    private Map<Long, Object> cache = new HashMap<>();

    @Pointcut("execution(* exam02.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Signature sig = joinPoint.getSignature();
        System.out.println("getName() : " + sig.getName());
        System.out.println("toLongString() : " + sig.toLongString());
        System.out.println("toShortString() : " + sig.toShortString());

        Object result = joinPoint.proceed();

        return result;
    }
}
