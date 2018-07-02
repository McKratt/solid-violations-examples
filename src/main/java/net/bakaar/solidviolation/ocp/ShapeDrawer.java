package net.bakaar.solidviolation.ocp;


import java.util.List;

public class ShapeDrawer {
    /**
     * If I have a new Shape, like Triangle for example, I have to modify this method (i.e. this class). That's a OCP violation !
     */
    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.getType().getDrawable().draw();
        }
    }
}
