package Iterator.zadanie;


public class Iterable {
    Kolor kolor;

    public Iterable() {
        double rand = Math.random();
        if(rand > 0.5) {
            kolor = Kolor.BIALE;
        } else {
            kolor = Kolor.CZERWONE;
        }
    }

    public String getKolor() {
        return kolor.toString();
    }
}
