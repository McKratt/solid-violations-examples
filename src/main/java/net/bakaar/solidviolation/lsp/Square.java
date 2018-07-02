package net.bakaar.solidviolation.lsp;

public class Square {

    protected int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return width * width;
    }
}
