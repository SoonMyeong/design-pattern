package com.soon.design._21_strategy;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println(" 무궁화 꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("피었 습니다.");
    }
}
