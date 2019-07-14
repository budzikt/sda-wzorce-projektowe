package fabrykaAbstrakcyjna.zadanie.element.sciana;

public class ScianaKamienna extends Sciana {

    private float gramaturaKamieni;

    public ScianaKamienna(float cena, float wysokosc, float dlugosc) {
        super(cena, wysokosc, dlugosc);
    }

    public void setGramaturaKamieni(float gramaturaKamieni) {
        this.gramaturaKamieni = gramaturaKamieni;
    }
}
