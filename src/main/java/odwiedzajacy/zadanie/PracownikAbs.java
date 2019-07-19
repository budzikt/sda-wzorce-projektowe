package odwiedzajacy.zadanie;

public abstract class PracownikAbs {
    int zarobkiNaRok;

    public PracownikAbs(int zarobkiNaRok) {
        this.zarobkiNaRok = zarobkiNaRok;
    }

    public abstract double przyjmijOdwiedzajacego(Odwiedzajacy odw);
}
