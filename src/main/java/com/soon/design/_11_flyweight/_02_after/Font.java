package com.soon.design._11_flyweight._02_after;

public final class Font {

    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }


    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
