package fabrykaAbstrakcyjna.przyklad.fabryki;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.KoloTerenowe;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.LusterkoSportowe;

public class FabrykaTerenowa extends FabrykaAbstrakcyjna {
    @Override
    public Kolo getKolo(Material m) {
        return  new KoloTerenowe(m);
    }

    @Override
    public Lusterko getLusterko(Material m) {
        return new LusterkoSportowe(m);
    }
}
