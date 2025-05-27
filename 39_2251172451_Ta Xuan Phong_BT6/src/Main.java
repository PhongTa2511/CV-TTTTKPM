import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));

        AreaCalculatorAdapter adapter = new AreaCalculatorAdapter();
        double totalArea = adapter.calculateTotalArea(shapes);

        System.out.println("Tổng diện tích các hình: " + totalArea);
    }
}
