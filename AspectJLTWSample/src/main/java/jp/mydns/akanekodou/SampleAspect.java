package jp.mydns.akanekodou;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {
    @Pointcut("execution(public String Sample.hello(..))")
    void helloCut() {}

    @Before("helloCut()")
    public void beforeHello() {
        System.out.println("Hey!!");
    }
}
