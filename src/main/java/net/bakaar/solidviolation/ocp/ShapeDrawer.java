package net.bakaar.solidviolation.ocp;


import java.util.Arrays;
import java.util.List;

public class ShapeDrawer {

    List<Drawer> drawers = Arrays.asList(new CircleDrawer(), new SquareDrawer());
    /**
     * If I have a new Shape, like Triangle for example, I have to modify this method (i.e. this class). That's a OCP violation !
     */
    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            for (Drawer drawer : drawers) {
                if (drawer.canDraw(shape)) {
                    drawer.draw();
                    break;
                }
            }
        }
    }
}
