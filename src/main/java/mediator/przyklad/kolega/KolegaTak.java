package mediator.przyklad.kolega;

import mediator.przyklad.mediator.Mediator;

public class KolegaTak extends Kolega {

    public KolegaTak(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doAction() {
        this.stan = true;
        System.out.println("Moj stan to zawsze: " + this.stan);
    }
}
