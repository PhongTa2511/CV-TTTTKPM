public class Client {
    public void useShapes() {
        Shape circle = new ExtendedShape(new CircleImplementor(5));
        Shape rectangle = new ExtendedShape(new RectangleImplementor(4, 6));

        ((ExtendedShape) circle).printArea();     // Kết quả: Area: 78.53981633974483
        ((ExtendedShape) rectangle).printArea();  // Kết quả: Area: 24.0
    }

    public static void main(String[] args) {
        new Client().useShapes();
    }
}

