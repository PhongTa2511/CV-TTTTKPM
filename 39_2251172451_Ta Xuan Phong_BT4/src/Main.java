import java.util.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ConcreteShapeFactory();

        Shape circle = factory.createCircle(5);
        Shape rectangle = factory.createRectangle(4, 6);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Tổng diện tích: " + totalArea);
    }
}
