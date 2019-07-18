package obserwator.zadanie;

import java.util.ArrayList;
import java.util.List;

public abstract class Temat {

    private List<Obserwator> listaObserwatorow;

    Temat() {
        listaObserwatorow = new ArrayList<Obserwator>();
    }

    public void dodajObserwatore(Obserwator obs) {
        listaObserwatorow.add(obs);
    }

    public void usunObserwatora(Obserwator obs) {
        if(listaObserwatorow.contains(obs)) {
            int idx = listaObserwatorow.indexOf(obs);
            listaObserwatorow.remove(idx);
        }
    }

    public void zdarzenie(String wiadomosc) {
        for(Obserwator obs : listaObserwatorow) {
            obs.powiadom(wiadomosc);
        }
    }

}
