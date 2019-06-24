package fabrykaAbstrakcyjna.przyklad.produkty.kola;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;

public class KoloTerenowe extends Kolo {
    public KoloTerenowe(Material m) {
        super(m);
    }

    @Override
    public String toString() {
        return "Jestem kolem terenowym wykonanym z" + material.toString();
    }
}
