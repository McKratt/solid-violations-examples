package net.bakaar.solidviolation.ocp;

public class Circle implements Shape {
    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }
}
