package fabrykaAbstrakcyjna.przyklad.fabryki;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.KoloSportowe;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.LusterkoSportowe;

public class FabrykaSportowa extends FabrykaAbstrakcyjna {
    @Override
    public Kolo getKolo(Material m) {
        return new KoloSportowe(m);
    }

    @Override
    public Lusterko getLusterko(Material m) {
        return new LusterkoSportowe(m);
    }
}
