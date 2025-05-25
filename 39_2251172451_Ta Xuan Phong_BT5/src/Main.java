import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeDirector director = new ShapeDirector();
        List<Shape> shapes = new ArrayList<>();

        // Build a circle
        ShapeBuilder circleBuilder = new CircleBuilder(5);
        director.setBuilder(circleBuilder);
        shapes.add(director.constructShape());

        // Build a rectangle
        ShapeBuilder rectangleBuilder = new RectangleBuilder(4, 6);
        director.setBuilder(rectangleBuilder);
        shapes.add(director.constructShape());

        // Calculate total area
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Tổng diện tích các hình: " + totalArea);
    }
}
