package com.soon.design._21_strategy;

public class Client {

    // 새로운 전략이 추가 될 때 인터페이스 구현체를 만들면 되므로 편리함, OCP 지킴
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        blueLightRedLight.blueLight(new Normal());
        blueLightRedLight.redLight(new Faster());
        blueLightRedLight.blueLight(new Speed() { //마치 comparator 와 흡사한 형태!
            @Override
            public void blueLight() {

            }

            @Override
            public void redLight() {

            }
        });
    }
}
