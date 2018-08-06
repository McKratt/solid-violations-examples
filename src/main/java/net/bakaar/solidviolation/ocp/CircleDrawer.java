package net.bakaar.solidviolation.ocp;

public class CircleDrawer implements Drawer {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public boolean canDraw(Shape shape) {
        return shape instanceof Circle;
    }
}
