package stan.zadanie;

public class Pacjent {
    private Stan stan;

    public Pacjent() {
        double val = Math.random();
        if(val > 0.66) {
            ozdrowiej();
        } else {
            zachoruj();
        }
    }

    public String nowyDzienWSzpitalu() {
        double val = Math.random();
        if(val > 0.66) {
            ozdrowiej();
        } else {
            zachoruj();
        }
        return mow();
    }

    private void zachoruj() {
        stan = new Chory();
    }

    private void ozdrowiej() {
        stan = new Zdrowy();
    }

    public String mow() {
        return stan.mow();
    }

}
