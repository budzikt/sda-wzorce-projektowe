package pylek.przyklad;

import java.util.HashMap;
import java.util.Map;

public class MagazynPylkow {
    private Map<Integer, Pylek> bazaPylkow;

    public MagazynPylkow() {
        bazaPylkow = new HashMap<>();
    }

    public Pylek pobierzPylek(int id) {
        if(bazaPylkow.containsKey(id)) {
            return bazaPylkow.get(id);
        } else {
            return null;
        }
    }

    public void ustawPylekUzytkownika(UzytkownikPylka up) {
        int id = up.getWymaganeId();
        Pylek p = this.pobierzPylek(id);
        if(p != null) {
            up.setMojPylek(p);
        } else {
            this.bazaPylkow.put(id, new PylekKonkretny(id, id));
            up.setMojPylek(this.pobierzPylek(id));
        }
    }
}
