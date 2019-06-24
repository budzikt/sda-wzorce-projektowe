package adapter.przyklad;

public class AdapterSystemu extends InterfejsSystemowy {

    AdaptowanaKlasa adaptowanaKlasa;

    public AdapterSystemu(AdaptowanaKlasa adaptowanaKlasa) {
        this.adaptowanaKlasa = adaptowanaKlasa;
    }

    @Override
    public double wyliczWartosc(int dlugoscWCm) {
        double adaptowanaWartosc = dlugoscWCm * 100;
        return this.adaptowanaKlasa.wyznaczWartosc(adaptowanaWartosc);
    }
}
