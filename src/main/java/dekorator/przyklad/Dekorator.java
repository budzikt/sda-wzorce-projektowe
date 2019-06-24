package dekorator.przyklad;

public abstract class Dekorator extends Dekorowalny {

    protected Dekorowalny dekorowanyElement;


    public Dekorator(Dekorowalny dekorowanyElement) {
        this.dekorowanyElement = dekorowanyElement;
    }

    @Override
    public int pobierzCene() {
        return this.dekorowanyElement.pobierzCene();
    }

    @Override
    public void wykonajAkcje() {
        this.dekorowanyElement.wykonajAkcje();
    }
}
