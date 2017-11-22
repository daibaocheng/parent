package com.vankeytech.pmp.auth.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author  xieliang
 */
@Component
@Aspect
public class TestAOP {

    /**
     *
     */
    @Pointcut("execution(* com.vankeytech.pmp.auth.intf..*.*(..))")
    public void executeService(){}

    /**
     * 在访问方法前 执行
     * @param joinPoint
     */
    @Before("executeService()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("前置通知");
    }

    /**
     * 后置返回通知
     * 这里需要注意的是:
     *      如果参数中的第一个参数为JoinPoint，则第二个参数为返回值的信息
     *      如果参数中的第一个参数不为JoinPoint，则第一个参数为returning中对应的参数
     * returning 限定了只有目标方法返回值与通知方法相应参数类型时才能执行后置返回通知，否则不执行，对于returning对应的通知方法参数为Object类型将匹配任何目标返回值
     * @param joinPoint
     * @param keys
     */
    @AfterReturning(value = "execution(* com.vankeytech.pmp.auth.intf..*.*(..))",returning = "keys")
    public void doAfter(JoinPoint joinPoint, Object keys){

        System.out.println("我在目标方法return后执行");
    }

    /**
     * 后置异常通知
     *  定义一个名字，该名字用于匹配通知实现方法的一个参数名，当目标方法抛出异常返回后，将把目标方法抛出的异常传给通知方法；
     *  throwing 限定了只有目标方法抛出的异常与通知方法相应参数异常类型时才能执行后置异常通知，否则不执行，
     *      对于throwing对应的通知方法参数为Throwable类型将匹配任何异常。
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "executeService()", throwing = "exception")
    public void doException( JoinPoint joinPoint, Throwable exception){
        joinPoint.getSignature().getName();
        System.out.println("我是在目标方法抛出异常后执行");
    }

    /**
     * 在目标方法执行完后执行在
     * @param joinPoint
     */
    @After("executeService()")
    public void doafter(JoinPoint  joinPoint){
        System.out.println("我在目标方法执行完成后执行");
    }

    /**
     * 环绕通知：
     *   环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     *   环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     */
    @Around("executeService()")
    public Object fdf(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("我是环绕通知 可以在之前执行");

        try {
            Object o = proceedingJoinPoint.proceed();
            System.out.println("环绕通知在之后执行");
            return o;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }

    }


}
