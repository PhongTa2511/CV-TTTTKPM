public class RectangleAreaStrategy implements AreaStrategy {
    private double width;
    private double height;

    public RectangleAreaStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
