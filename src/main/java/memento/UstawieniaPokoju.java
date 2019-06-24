package memento;

public class UstawieniaPokoju {
    private PODLOGA podloga;
    private KOLOR_SCIAN kolor_scian;

    public UstawieniaPokoju(PODLOGA podloga, KOLOR_SCIAN kolor_scian) {
        this.podloga = podloga;
        this.kolor_scian = kolor_scian;
    }

    public PODLOGA getPodloga() {
        return podloga;
    }

    public KOLOR_SCIAN getKolor_scian() {
        return kolor_scian;
    }
}
