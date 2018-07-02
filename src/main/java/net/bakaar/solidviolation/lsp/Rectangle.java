package net.bakaar.solidviolation.lsp;

public class Rectangle extends Square {

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return height * width;
    }
}
