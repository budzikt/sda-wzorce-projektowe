package mediator.przyklad.mediator;

import mediator.przyklad.kolega.Kolega;

public class KonkretnyMediatorSwap extends Mediator {

    private String oczekiwanyWynik;

    private StrategiaMediacji strategia;

    public KonkretnyMediatorSwap(StrategiaMediacji strategia, String oczekiwanyWynik) {
        this.strategia = strategia;
        this.oczekiwanyWynik = oczekiwanyWynik;
    }

    @Override
    public boolean mediuj(Kolega kol) {
        boolean wynik = this.strategia.mediuj(this.listaKolegow);
        this.wynikMediacji = wynik;
        return wynikMediacji;
    }

    @Override
    public String wypiszOczekiwanyWynik() {
        return this.oczekiwanyWynik;
    }

    public void dodajStrategie(StrategiaMediacji strategia) {
        this.strategia = strategia;
    }
}
