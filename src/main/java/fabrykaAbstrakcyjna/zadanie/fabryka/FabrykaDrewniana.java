package fabrykaAbstrakcyjna.zadanie.fabryka;

import fabrykaAbstrakcyjna.zadanie.element.Element;
import fabrykaAbstrakcyjna.zadanie.element.drzwi.Drzwi;
import fabrykaAbstrakcyjna.zadanie.element.okno.Okno;
import fabrykaAbstrakcyjna.zadanie.element.sciana.Sciana;

public class FabrykaDrewniana extends Fabryka {

    @Override
    public Sciana getSciana(float cena, float wysokosc, float dlugosc) {
        return null;
    }

    @Override
    public Okno getOkno() {
        return null;
    }

    @Override
    public Drzwi getDrzwi() {
        return null;
    }
}
