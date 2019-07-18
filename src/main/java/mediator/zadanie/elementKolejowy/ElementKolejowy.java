package mediator.zadanie.elementKolejowy;

import mediator.zadanie.MediatorKolejowy;

public abstract class ElementKolejowy {

    protected boolean moznaJechac = false;


    private int id;
    private MediatorKolejowy mediator;

    public ElementKolejowy(MediatorKolejowy mediator, int id) {
        this.mediator = mediator;
        this.id = id;
    }

    public boolean isMoznaJechac() {
        return moznaJechac;
    }

    public int getId() {
        return id;
    }

    protected abstract void akcjaNaStop();
    protected abstract void akcjaNaJedz();

    public final void wykonajAkcjeStop() {
        this.akcjaNaStop();
        this.mediator.mediuj(this);
    }
    public final void wykonajAkcjeJedz() {
        this.akcjaNaJedz();
        this.mediator.mediuj(this);
    }
}
