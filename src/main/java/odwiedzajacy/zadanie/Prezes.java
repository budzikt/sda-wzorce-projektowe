package odwiedzajacy.zadanie;

public class Prezes extends PracownikAbs {
    int premiaUznaniowa;

    public Prezes(int zarobkiNaRok, int premiaUznaniowa) {
        super(zarobkiNaRok);
        this.premiaUznaniowa = premiaUznaniowa;
    }

    public double przyjmijOdwiedzajacego(Odwiedzajacy odw) {
        return odw.odwiedzPrezesa(this);
    }
}
