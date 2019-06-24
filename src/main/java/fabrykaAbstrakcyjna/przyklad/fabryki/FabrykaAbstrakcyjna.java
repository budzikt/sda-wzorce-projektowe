package fabrykaAbstrakcyjna.przyklad.fabryki;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;

public abstract class FabrykaAbstrakcyjna {

    public abstract Kolo getKolo(Material m);
    public abstract Lusterko getLusterko(Material m);

}
