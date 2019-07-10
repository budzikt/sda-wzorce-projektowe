package fabryka.zadanie.pojazd;

public abstract class Pojazd {
    private String kolor;

    Pojazd(String kolor) {
        this.kolor = kolor;
    }

    public abstract void drive();

    public String getKolor() {
        return kolor;
    }
}
