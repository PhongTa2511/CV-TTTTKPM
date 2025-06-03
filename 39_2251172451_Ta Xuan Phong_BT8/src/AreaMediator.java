import java.util.ArrayList;
import java.util.List;

public class AreaMediator implements Mediator {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
        shape.setMediator(this);
    }

    @Override
    public void notify(Shape sender) {
        System.out.println("A shape has triggered the mediator.");
        System.out.println("Trigger from: " + sender.getClass().getSimpleName());
        System.out.println("Shape area: " + sender.calculateArea());
        System.out.println("Total area: " + calculateTotalArea());
        System.out.println();
    }

    public double calculateTotalArea() {
        return shapes.stream().mapToDouble(Shape::calculateArea).sum();
    }
}
