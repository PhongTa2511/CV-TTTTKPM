public abstract class Shape {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract double calculateArea();

    public void trigger() {
        if (mediator != null) {
            mediator.notify(this);
        }
    }
}
