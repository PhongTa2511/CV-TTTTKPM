public class ConcreteShapeFactory implements ShapeFactory {
    public Shape createCircle(double radius) {
        return new Circle(radius);
    }

    public Shape createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }
}
