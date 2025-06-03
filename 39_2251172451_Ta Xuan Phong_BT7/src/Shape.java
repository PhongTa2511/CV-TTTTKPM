public abstract class Shape {
    protected ShapeImplementor implementor;

    public Shape(ShapeImplementor implementor) {
        this.implementor = implementor;
    }

    public double getArea() {
        return implementor.calculateArea();
    }
}
