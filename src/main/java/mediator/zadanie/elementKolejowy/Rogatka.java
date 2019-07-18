package mediator.zadanie.elementKolejowy;

import mediator.zadanie.MediatorKolejowy;

public class Rogatka extends ElementKolejowy {

    private int klikniecia = 0;

    public Rogatka(MediatorKolejowy mediator, int id) {
        super(mediator, id);
    }

    @Override
    protected void akcjaNaStop() {
        this.moznaJechac = false;
    }

    @Override
    protected void akcjaNaJedz() {
        if(++this.klikniecia > 4) {
            this.moznaJechac = true;
        }
    }
}
