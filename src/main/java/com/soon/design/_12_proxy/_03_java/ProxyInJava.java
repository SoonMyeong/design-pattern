package com.soon.design._12_proxy._03_java;

import com.soon.design._12_proxy._02_after.DefaultGameService;
import com.soon.design._12_proxy._02_after.GameService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//Dynamic proxy , 리플랙션
//런타임 중에 프록시를 만들어냄
public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{GameService.class}
                , new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("=================================");
                method.invoke(target,args);
                System.out.println("==================================");
                return null;
            }
        });
    }

}
