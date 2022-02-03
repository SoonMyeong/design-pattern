package com.soon.design._02_factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteShipFactory(),"whiteShip","soon@mail.com");
        client.print(new BlackShipFactory(),"blackShip","soon@mail.com");

//        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip","soon@mail.com");
//        System.out.println(whiteShip);
//
//        Ship blackShip = new BlackShipFactory().orderShip("blackShip","black@mail.com");
//        System.out.println(blackShip);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }

}
