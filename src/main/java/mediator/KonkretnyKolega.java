package mediator;

public class KonkretnyKolega extends Kolega {

    private float szansa;

    public KonkretnyKolega(float szansa, Mediator m) {
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
        this.mediator.mediate(this);
    }
}
