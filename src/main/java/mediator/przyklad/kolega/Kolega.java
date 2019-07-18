package mediator.przyklad.kolega;

import mediator.przyklad.mediator.Mediator;

public abstract class Kolega {

    protected boolean stan;

    protected Mediator mediator;

    public boolean getStan() {
        return this.stan;
    }

        public Kolega(Mediator mediator) {
        this.mediator = mediator;
    }


    protected abstract void doAction();

    public final void doActionAndNotify() {
        this.doAction();
        this.mediator.mediuj(this);
    }
}
