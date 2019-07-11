package budowniczy.zadanie;

public class Zarzadca {
    private Budowniczy b;

    public Zarzadca(Budowniczy b) {
        this.b = b;
    }

    public void zmienBuildera(Budowniczy b) {
        this.b = b;
    }

    public Zarzadca dodajDaneOsobowe(String imie, String nazwisko, Long pesel) {
        b.dodajDaneOgolne(imie, nazwisko, pesel);
        return this;
    }

    public DaneOsobowe pobierzDaneOsobowe() {
        return b.pobierzDaneOsobowe();
    }

    public Budowniczy dodajDaneOgolne(String imie, String nazwisko, Long pesel) {
        return b.dodajDaneOgolne(imie, nazwisko, pesel);
    }

    public Zarzadca dodajDaneBiznesowe(String regon, Long nip) {
        b.dodajDaneBiznesowe(regon, nip);
        return this;
    }

    public Budowniczy dodajDaneOsobowe(String przezwisko) {
        return b.dodajDaneOsobowe(przezwisko);
    }
}
