package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    List<Kolega> listaKolegow;

    Mediator() {
        listaKolegow = new ArrayList<Kolega>();
    }

    protected void addKolega(Kolega k) {
        this.listaKolegow.add(k);
    }

    protected abstract boolean mediate(Kolega kol);
    public abstract boolean wynikMediacji();
}
