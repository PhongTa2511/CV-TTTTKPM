public class CircleBuilder implements ShapeBuilder {
    private double radius;
    private Shape shape;

    public CircleBuilder(double radius) {
        this.radius = radius;
    }

    @Override
    public void buildShape() {
        shape = new Circle(radius);
    }

    @Override
    public Shape getResult() {
        return shape;
    }
}
