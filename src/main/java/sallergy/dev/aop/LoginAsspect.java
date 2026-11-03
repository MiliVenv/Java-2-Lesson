package sallergy.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect()
public class LoginAsspect {

//    @Before("execution(* sallergy.dev.TaskManager.*(..))")
//    public void logBevore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* sallergy.dev.TaskManager.*(..))", returning = "result")
//    public void logAfterReturn(JoinPoint joinPoint, Object result) {
//        System.out.println("После возвращения результата: " + result);
//    }
//
//    @AfterThrowing(value = "execution(* sallergy.dev.TaskManager.*(..))", throwing = "exc")
//    public void logAfterThrowing(JoinPoint joinPoint, Exception exc) {
//        System.out.println("После ошибки: " + exc);
//    }
//
//    @After(value = "execution(* sallergy.dev.TaskManager.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("Всегда после: " + joinPoint.getSignature().getName());
//    }
//
//    @Around("execution(* sallergy.dev.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("До метода");
//        Integer result = (Integer) proceedingJoinPoint.proceed();
//        System.out.println("После метода");
//        return result/2;
//    }
    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable) {
        for (int i = 0; i < loggable.count(); i++) {
            System.out.println("LOG before method = " + joinPoint.getSignature().getName() + " " + loggable.value());
        }
    }
}
