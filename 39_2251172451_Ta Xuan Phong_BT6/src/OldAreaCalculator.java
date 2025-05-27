import java.util.List;

public class OldAreaCalculator {
    public double calculateTotalAreaWithDouble(List<Double> areas) {
        double total = 0;
        for (Double area : areas) {
            total += area;
        }
        return total;
    }
}
