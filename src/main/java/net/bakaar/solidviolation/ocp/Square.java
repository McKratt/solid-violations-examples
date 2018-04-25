package net.bakaar.solidviolation.ocp;

public class Square implements Shape {
    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }
}
