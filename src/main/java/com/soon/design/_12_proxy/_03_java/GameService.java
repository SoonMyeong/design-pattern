package com.soon.design._12_proxy._03_java;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void startGame() throws InterruptedException {
        System.out.println("게임이 시작 되었습니다.");
    }
}
