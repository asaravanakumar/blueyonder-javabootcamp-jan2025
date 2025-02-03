package com.labs.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect// Proxy mode is set to "false" to use the CGLIB proxy instead of the default JDK proxy
public class LoggingAspect {

    // Pointcut expression to match all methods in the com.labs.spring.aop package
    @Before("execution(* greet(*))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Before Method Execution: " + joinPoint.getSignature().toString() + " called");
    }

    @After("execution(* greet(*))")  // After method execution, print the method name and parameters
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("After Method Execution: " + joinPoint.getSignature().toString() + " called");
    }
}
