package adapter.przyklad;

import adapter.przyklad.pakiet.innej.firmy.AdaptowanaKlasa;

public class AdapterSystemu extends InterfejsSystemowy {

    AdaptowanaKlasa adaptowanaKlasa;

    private int gwiazdki;

    public AdapterSystemu(AdaptowanaKlasa adaptowanaKlasa, int ileGwiazdek) {
        this.adaptowanaKlasa = adaptowanaKlasa;
        this.gwiazdki = ileGwiazdek;
    }

    @Override
    public String wypiszDuzeLitery(String tekst) {
        return this.adaptowanaKlasa.dodajGwiazdki( tekst.toUpperCase(), this.gwiazdki);
    }
}
