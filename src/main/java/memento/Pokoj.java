package memento;

public class Pokoj {
    KOLOR_SCIAN kolor_scian;
    PODLOGA podloga;

    public  Pokoj() {
        kolor_scian = KOLOR_SCIAN.CZERWONE;
        podloga = PODLOGA.PANELE;
    }

    public  Pokoj(UstawieniaPokoju up) {
        kolor_scian = up.getKolor_scian();
        podloga = up.getPodloga();
    }

    public void setKolor_scian(KOLOR_SCIAN kolor_scian) {
        this.kolor_scian = kolor_scian;
    }

    public void setPodloga(PODLOGA podloga) {
        this.podloga = podloga;
    }

    public UstawieniaPokoju pobierzStan() {
        return new UstawieniaPokoju(podloga, kolor_scian);
    }

    public void przywrocStan(UstawieniaPokoju up) {
        this.kolor_scian = up.getKolor_scian();
        this.podloga = up.getPodloga();
    }

    @Override
    public String toString () {
        return "Ogladasz pokoj " + kolor_scian.toString() + " " + podloga.toString();
    }
}
