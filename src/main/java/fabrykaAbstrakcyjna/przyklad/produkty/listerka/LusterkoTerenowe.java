package fabrykaAbstrakcyjna.przyklad.produkty.listerka;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;

public class LusterkoTerenowe extends Lusterko {
    public LusterkoTerenowe(Material m) {
        super(m);
    }

    @Override
    public String toString() {
        return "Jestem lusterkiem terenowym wykonanyym z" + material.toString();
    }
}
