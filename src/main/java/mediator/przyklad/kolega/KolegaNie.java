package mediator.przyklad.kolega;

import mediator.przyklad.mediator.Mediator;

public class KolegaNie extends Kolega {

    public KolegaNie(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void doAction() {
        this.stan = false;
        System.out.println("Moj stan to zawsze: " + this.stan);
    }
}
