package net.bakaar.solidviolation.ocp;

public class Square implements Shape {
    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }

    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
