package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
//    Point cuts
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp){
        System.out.println(jp.getSignature());
        String arg=jp.getArgs()[0].toString();
        System.out.println("Before Logger with argument: "+arg);
    }
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}
