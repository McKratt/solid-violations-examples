package net.bakaar.solidviolation.ocp;

public enum ShapeType {
    CIRCLE(() -> {
        System.out.println("Draw circle");
    }),
    SQUARE(() -> {
        System.out.println("Draw square");
    });

    private Drawable drawable;

    ShapeType(Drawable drawable) {
        this.drawable = drawable;
    }

    public Drawable getDrawable() {
        return drawable;
    }
}
