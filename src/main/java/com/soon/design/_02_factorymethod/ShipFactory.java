package com.soon.design._02_factorymethod;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name,email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    //JDK 9 이후터는 private 가능 해서 private 메서드 만들고, 인터페이스 바로 구현하면 됨
//    private void sendEmailTo(String email, Ship ship) {
//        System.out.println(ship.getName() + "다 만들었습니다.");
//    }

    void sendEmailTo(String email, Ship ship);


    Ship createShip();

    private void prepareFor(String name) {
        System.out.println(name + "준비 중..");
    }

    private void validate(String name, String email) {

        if(name ==null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력 해 주세요.");
        }

        if(email ==null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 입력 해 주세요.");
        }
    }

}
