package dekorator.zadanie;

public class Szyneczka extends Pizza {

    private Pizza element;

    public Szyneczka(Pizza pizza) {
        this.element = pizza;
    }

    @Override
    public int podajCene() {
        return element.podajCene() + 3;
    }

    @Override
    public int pobierzIloscSkladnikw() {
        return element.pobierzIloscSkladnikw() + 1;
    }
}
