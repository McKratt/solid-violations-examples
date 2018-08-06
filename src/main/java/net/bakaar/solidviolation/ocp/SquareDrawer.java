package net.bakaar.solidviolation.ocp;

public class SquareDrawer implements Drawer {
    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }

    @Override
    public boolean canDraw(Shape shape) {
        return shape instanceof Square;
    }
}
