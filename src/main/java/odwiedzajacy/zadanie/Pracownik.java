package odwiedzajacy.zadanie;

public class Pracownik extends PracownikAbs {


    public Pracownik(int zarobkiNaRok) {
        super(zarobkiNaRok);
    }

    public double przyjmijOdwiedzajacego(Odwiedzajacy odw) {
        return odw.odziwezNormalnegoPracownika(this);
    }
}
