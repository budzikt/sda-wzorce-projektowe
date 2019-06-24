package memento;

public class Nadzorca {

    private Memento memento;
    private Pokoj pokoj;

    public Nadzorca() {
        pokoj = new Pokoj();
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public Pokoj ustawNowe(UstawieniaPokoju up) {
        memento = new Memento(pokoj.pobierzStan());
        pokoj.setKolor_scian(up.getKolor_scian());
        pokoj.setPodloga(up.getPodloga());
        return pokoj;
    }

    public Pokoj przywroc() {
        pokoj.przywrocStan(memento.odzyskaj());
        return pokoj;
    }
}
