public class ShapeDirector {
    private ShapeBuilder builder;

    public void setBuilder(ShapeBuilder builder) {
        this.builder = builder;
    }

    public Shape constructShape() {
        builder.buildShape();
        return builder.getResult();
    }
}
