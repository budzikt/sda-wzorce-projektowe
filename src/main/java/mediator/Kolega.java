package mediator;

public abstract class Kolega {

    protected Mediator mediator;

    boolean stan;

    public Kolega(Mediator mediator) {
        this.mediator = mediator;
    }

    protected  void notifyMed() {
        this.doAction();
        this.mediator.mediate(this);
    }

    public abstract void doAction();
}
