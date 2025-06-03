public class ExtendedShape extends Shape {

    public ExtendedShape(ShapeImplementor implementor) {
        super(implementor);
    }

    public void printArea() {
        System.out.println("Area: " + getArea());
    }
}
