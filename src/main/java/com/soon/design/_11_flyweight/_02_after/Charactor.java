package com.soon.design._11_flyweight._02_after;

public class Charactor {

    private char value;
    private String color;
    private Font font;

    public Charactor(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public char getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public Font getFont() {
        return font;
    }
}
