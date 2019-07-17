package dekorator.zadanie.pizza;

public class PizzaImpl extends Pizza {

    public PizzaImpl(int basePrice) {
        this.cena = basePrice;
    }

    @Override
    public int podajCene() {
        return this.cena;
    }

    @Override
    public int pobierzIloscSkladnikw() {
        return 1;
    }
}
