class Client {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Hình tròn bán kính 5
        shape.setStrategy(new CircleAreaStrategy(5));
        System.out.println("Circle Area: " + shape.getArea());

        // Hình chữ nhật 4x6
        shape.setStrategy(new RectangleAreaStrategy(4, 6));
        System.out.println("Rectangle Area: " + shape.getArea());
    }
}
