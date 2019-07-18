package mediator.przyklad.mediator;

import mediator.przyklad.kolega.Kolega;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected boolean wynikMediacji;
    List<Kolega> listaKolegow;

    public Mediator() {
        listaKolegow = new ArrayList<Kolega>();
    }

    public void addKolega(Kolega k) {
        this.listaKolegow.add(k);
    }

    public String wynikMediacji() {
        System.out.println(this.wypiszOczekiwanyWynik());
        return "Wynik mediacji to: " + this.wynikMediacji;
    }

    public abstract boolean mediuj(Kolega kol);
    public abstract String wypiszOczekiwanyWynik();

}
