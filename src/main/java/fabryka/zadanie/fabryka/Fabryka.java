package fabryka.zadanie.fabryka;

import fabryka.zadanie.PojazdType;
import fabryka.zadanie.pojazd.Pojazd;

public abstract class Fabryka {

    public abstract Pojazd buildPojazd(String kolor, PojazdType typ);
}
