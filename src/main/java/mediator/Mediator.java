package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    List<Kolega> listaKolegow;

    Mediator() {
        listaKolegow = new ArrayList<Kolega>();
    }

    protected abstract void mediate(Kolega kol);
}
