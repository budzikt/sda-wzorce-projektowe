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
        return this.element.podajCene() + this.cena;
    }

    @Override
    public int pobierzIloscSkladnikw() {
        return this.element.pobierzIloscSkladnikw() + 1;
    }
}
