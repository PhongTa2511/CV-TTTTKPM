public class CircleImplementor implements ShapeImplementor {
    private double radius;

    public CircleImplementor(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
