package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1)
@Aspect
public class ProxyCache {

    private Map<Long, Object> cache = new HashMap<>();

    @Around("exam02.aopex.CommonPointCut.publicTarget()")
//    @Around("execution(* exam02.aopex..*(..))")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        if (cache.containsKey(num)) { // 이미 캐시에 연산결과가 있는 경우
            System.out.println("캐시 사용!!");
            return cache.get(num);
        }

        Object result = joinPoint.proceed(); // ProxyCalculator::proceed() 위에 없다면, 다음 프록시가 시작되는 부분
        cache.put(num, result);
        System.out.println("캐시 저장!!");
        return result;
    }
}
