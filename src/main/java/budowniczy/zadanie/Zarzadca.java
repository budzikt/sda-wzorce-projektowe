package budowniczy.zadanie;

import budowniczy.zadanie.budowniczy.Budowniczy;

public class Zarzadca {
    private Budowniczy b;

    public Zarzadca(Budowniczy b) {
        this.b = b;
    }

    public void zmienBuildera(Budowniczy b) {
        this.b = b;
    }

    public Zarzadca dodajDaneOgolne(String imie, String nazwisko, Long pesel) {
        b.dodajDaneOgolne(imie, nazwisko, pesel);
        return this;
    }

    public Zarzadca dodajDaneBiznesowe(String regon, Long nip) {
        b.dodajDaneBiznesowe(regon, nip);
        return this;
    }

    public Zarzadca dodajDaneOsobowe(String przezwisko) {
        b.dodajDaneOsobowe(przezwisko);
        return this;
    }

    public DaneOsobowe pobierzDaneOsobowe() {
        return b.pobierzDaneOsobowe();
    }
}
