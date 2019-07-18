package mediator.przyklad.mediator;

import mediator.przyklad.kolega.Kolega;

import java.util.List;


public interface StrategiaMediacji {
    boolean mediuj(List<Kolega> koledzy);
}
