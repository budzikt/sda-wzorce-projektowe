package kompozyt.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Karton extends Komponent {

    private List<Komponent> listaKomponentow;
    private int id;

    public Karton(int id) {
        this.id = id;
        this.listaKomponentow = new ArrayList<>();
    }

    @Override
    public Komponent pobierzDziecko(int idx) {
        return this.listaKomponentow.get(idx);
    }

    @Override
    public void dodajDziecko(Komponent k) {
        this.listaKomponentow.add(k);
    }

    @Override
    public void usunDziecko(int idx) {
        listaKomponentow.remove(idx);
    }

    @Override
    public String wykonajAkcje() {
        String ret = "Akcja na elemencie złożonym o id: " + this.id;
        for(Komponent k : this.listaKomponentow) {
            ret += "\n" + k.wykonajAkcje();
        }
        return ret;
    }
}
