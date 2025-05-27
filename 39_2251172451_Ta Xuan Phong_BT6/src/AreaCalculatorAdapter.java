import java.util.ArrayList;
import java.util.List;

public class AreaCalculatorAdapter {
    private OldAreaCalculator oldCalculator;

    public AreaCalculatorAdapter() {
        this.oldCalculator = new OldAreaCalculator();
    }

    public double calculateTotalArea(List<Shape> shapes) {
        List<Double> areas = new ArrayList<>();
        for (Shape shape : shapes) {
            areas.add(shape.calculateArea());
        }
        return oldCalculator.calculateTotalAreaWithDouble(areas);
    }
}
