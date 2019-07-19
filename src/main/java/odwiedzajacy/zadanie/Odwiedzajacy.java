package odwiedzajacy.zadanie;

public class Odwiedzajacy  {

    public double odziwezNormalnegoPracownika(Pracownik p) {
        return p.zarobkiNaRok * 0.18;
    }

    public double odwiedzPrezesa(Prezes p) {
        return  p.zarobkiNaRok * 0.18 + 0.3 * p.premiaUznaniowa;
    }
}
