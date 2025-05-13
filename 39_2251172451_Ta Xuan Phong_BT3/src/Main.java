import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ShapeFactory> factories = new ArrayList<>();
        factories.add(new CircleFactory(3));
        factories.add(new RectangleFactory(4, 5));

        List<Shape> shapes = new ArrayList<>();
        for (ShapeFactory factory : factories) {
            shapes.add(factory.createShape());
        }

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Tổng diện tích: " + totalArea);
    }
}
