package fabrykaAbstrakcyjna.przyklad.produkty.kola;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;

public class KoloSportowe extends Kolo {

    public KoloSportowe(Material m) {
        super(m);
    }

    @Override
    public String toString() {
        return "Jestem kolem sportowym wykonanym z " + material.toString();
    }
}
