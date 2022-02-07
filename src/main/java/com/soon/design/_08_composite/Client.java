package com.soon.design._08_composite;

public class Client {

    public static void main(String[] args) {

        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력포션",50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    //전체 합이나, 일부 합에 대한 부분을 Component 를 통해 하나의 메서드로 만들 수 있다.
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
