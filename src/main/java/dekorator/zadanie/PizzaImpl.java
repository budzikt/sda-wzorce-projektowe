package dekorator.zadanie;

public class PizzaImpl extends Pizza {

    public PizzaImpl(int basePrice) {
        this.cena = basePrice;
        this.liczbaSkladnikow = 0;
    }

    @Override
    public int podajCene() {
        return this.cena;
    }

    @Override
    public int pobierzIloscSkladnikw() {
        return this.liczbaSkladnikow;
    }
}
