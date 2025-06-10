public class CircleAreaStrategy implements AreaStrategy {
    private double radius;

    public CircleAreaStrategy(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
