package net.bakaar.solidviolation.ocp;


import java.util.List;

public class ShapeDrawer {
    /**
     * If I have a new Shape, like Triangle for example, I have to modify this method (i.e. this class). That's a OCP violation !
     */
    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            switch (shape.getType()) {
                case CIRCLE:
                    drawCircle((Circle) shape);
                    break;
                case SQUARE:
                    drawSquare((Square) shape);
                    break;
            }
        }

    }

    private void drawSquare(Square square) {
        System.out.println("Draw a Square " + square);
    }

    private void drawCircle(Circle circle) {
        System.out.println("Draw a Circle " + circle);
    }
}
