package dekorator.zadanie;

public class Ser extends Pizza {

    private Pizza element;

    public Ser(Pizza pizza) {
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

    @Override
    public void jakSmakuje() {
        super.jakSmakuje();
        System.out.println(" i bardzo sie ciagnie\n");
    }
}
