package Iterator.zadanie;

public class Kwiat {
    Kolor kolor;

    public Kwiat() {
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
