package dekorator.zadanie.dekoratory;

import dekorator.zadanie.pizza.Pizza;

public abstract class DekoratorPizzy extends Pizza {

    protected Pizza element;
    protected int cena;

    public DekoratorPizzy(Pizza element, int cena) {
        this.element = element;
        this.cena = cena;
    }

    @Override
    public int podajCene() {
        return 0;
    }

    @Override
    public int pobierzIloscSkladnikw() {
        return 0;
    }
}
