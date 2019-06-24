package adapter.przyklad;

public class AdaptowanaKlasa {

    private double wspolczynnik;

    public AdaptowanaKlasa(double wspolczynnik) {
        this.wspolczynnik = wspolczynnik;
    }

    public double wyznaczWartosc(double dlugoscWMm) {
        return dlugoscWMm * this.wspolczynnik;
    }
}
