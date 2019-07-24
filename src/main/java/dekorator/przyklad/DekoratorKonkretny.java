package dekorator.przyklad;

public class DekoratorKonkretny extends Dekorator {

    private int cena;

    public DekoratorKonkretny(int cena, Dekorowalny elementDoUdekorowania) {
        super(elementDoUdekorowania);
        this.cena = cena;
    }

    @Override
    public void wykonajAkcje() {
        System.out.println("Fajna akcja wykonana przed elementem dekorowanym");
        this.dekorowanyElement.wykonajAkcje();
    }

    @Override
    public int pobierzCene() {
        return this.cena + this.dekorowanyElement.pobierzCene();
    }
}
