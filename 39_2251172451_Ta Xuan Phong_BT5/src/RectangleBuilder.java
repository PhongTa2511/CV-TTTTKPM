public class RectangleBuilder implements ShapeBuilder {
    private double length;
    private double width;
    private Shape shape;

    public RectangleBuilder(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void buildShape() {
        shape = new Rectangle(length, width);
    }

    @Override
    public Shape getResult() {
        return shape;
    }
}
