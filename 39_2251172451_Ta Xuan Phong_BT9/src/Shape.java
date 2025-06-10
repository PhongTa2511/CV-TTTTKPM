public class Shape {
    private AreaStrategy strategy;

    public void setStrategy(AreaStrategy strategy) {
        this.strategy = strategy;
    }

    public double getArea() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set.");
        }
        return strategy.calculateArea();
    }
}
