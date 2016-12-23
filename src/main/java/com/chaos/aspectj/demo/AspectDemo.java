//package com.chaos.aspectj.demo;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//
///**
// * Created by zcfrank1st on 22/12/2016.
// */
//@Aspect
//public class AspectDemo {
//
//    @Pointcut(value = "execution(* com.chaos.aspectj.demo.IDemo.hello(..))")
//    public void demoPointCut() {}
//
//    @Around("demoPointCut()")
//    public void around(ProceedingJoinPoint point) throws Throwable {
//        System.out.println(point.getSourceLocation().getFileName());
//        System.out.println(point.getSignature().getDeclaringTypeName());
//        point.proceed();
//    }
//}
