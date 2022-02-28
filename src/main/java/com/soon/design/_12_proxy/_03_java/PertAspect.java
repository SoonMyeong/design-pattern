package com.soon.design._12_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PertAspect {

    @Around("bean(gameService)") //적용할 빈 설정
    public void timestamp(ProceedingJoinPoint point) throws Throwable { //point 매개변수는 gameservice 내에 있는 메서드를 가리킴
        long before = System.currentTimeMillis();
        point.proceed(); //메서드 실행
        System.out.println(System.currentTimeMillis() - before + "초 걸렸습니다.");
    }

}
