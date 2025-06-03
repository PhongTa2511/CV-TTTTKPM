public class Client {
    public static void main(String[] args) {
        AreaMediator mediator = new AreaMediator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        mediator.addShape(circle);
        mediator.addShape(rectangle);

        circle.trigger();
        rectangle.trigger();
    }
}

