package most.Zadanie1;

public abstract class KsztaltCzerowny extends Ksztalt{

    public KsztaltCzerowny(float wysokosc, float szerokosc) {
        super(wysokosc, szerokosc);
    }

    public void malujNaCzerwono() {
        System.out.println("Maluje na czerwono");
    }

    public abstract void przedstawSie();
}
