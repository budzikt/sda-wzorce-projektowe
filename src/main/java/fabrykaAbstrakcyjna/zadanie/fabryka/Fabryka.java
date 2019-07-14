package fabrykaAbstrakcyjna.zadanie.fabryka;

import fabrykaAbstrakcyjna.zadanie.element.Element;
import fabrykaAbstrakcyjna.zadanie.element.drzwi.Drzwi;
import fabrykaAbstrakcyjna.zadanie.element.okno.Okno;
import fabrykaAbstrakcyjna.zadanie.element.sciana.Sciana;

public abstract class Fabryka {

    public abstract Sciana getSciana(float cena, float wysokosc, float dlugosc);

    public abstract Okno getOkno();
    public abstract Drzwi getDrzwi();
}
