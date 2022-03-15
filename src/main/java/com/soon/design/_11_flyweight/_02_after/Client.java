package com.soon.design._11_flyweight._02_after;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Charactor c1 = new Charactor('h',"white",fontFactory.getFont("nanum:12"));
        Charactor c2 = new Charactor('e',"white",fontFactory.getFont("nanum:12"));
        Charactor c3 = new Charactor('l',"white",fontFactory.getFont("nanum:12"));
    }
}
