package com.soon.design._12_proxy._02_after;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() {
        System.out.println("게임이 시작 되었습니다!");
    }
}
