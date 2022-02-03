package com.soon.design._02_factorymethod;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다 만들었습니다.");
    }
}
