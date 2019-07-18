package mediator.przyklad.kolega;

import mediator.przyklad.mediator.Mediator;

public class LosowyKolega extends Kolega {

    private float szansa;

    public LosowyKolega(float szansa, Mediator m) {
        super(m);
        this.szansa = szansa;
    }

    @Override
    public void doAction() {
        if(Math.random() >= this.szansa) {
            this.stan = true;
        } else {
            this.stan = false;
        }
        System.out.println("Moj stan to: " + this.stan);
    }
}
