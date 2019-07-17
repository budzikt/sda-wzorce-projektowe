package most.Zadanie2;

public abstract class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public void przyspiesz() {
        this.silnik.dodajGazu();;
    }

    public void zmienSilnik(Silnik s) {
        this.silnik = s;
    }
}
