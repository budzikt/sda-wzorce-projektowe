package fabrykaAbstrakcyjna.zadanie.element.sciana;

import fabrykaAbstrakcyjna.zadanie.element.Element;

public abstract class Sciana extends Element {
    private float wysokosc;
    private float dlugosc;

    public Sciana(float cena, float wysokosc, float dlugosc) {
        super(cena);
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
    }
}
