package fabrykaAbstrakcyjna.przyklad.produkty.listerka;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;

public class LusterkoSportowe extends Lusterko {

    public LusterkoSportowe(Material m) {
        super(m);
    }

    @Override
    public String toString() {
        return "Jestem lusterkiem sportowym wykonanym z " + material.toString();
    }
}
