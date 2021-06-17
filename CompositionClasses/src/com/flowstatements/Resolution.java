package com.flowstatements;

public class Resolution {
    private int height ;
    private  int width;

    public Resolution(int height, int width) {

        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    // IN Monitor class we saw resolution
    // Since Resolution class was a part of monitor it is safe to say that this is the example of Composition.
    // monitor has a Resolution , relationship can be seen.

}
