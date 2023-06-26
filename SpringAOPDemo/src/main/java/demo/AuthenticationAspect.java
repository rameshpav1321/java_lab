package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(demo..*)")
    public void authenticatePointCut(){

    }
    @Pointcut("within(demo..*)")
    public void authorizePointCut(){

    }

    @Before("authenticatePointCut() && authorizePointCut()")
    public void authenticate(){
        System.out.println("Request has been authenticated...");
    }
//
//    public void authorize(){
//        System.out.println("Request is authorized for the following:....");
//    }
}
