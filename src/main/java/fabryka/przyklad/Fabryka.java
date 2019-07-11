package fabryka.przyklad;

import fabryka.przyklad.produkt.Produkt;
import fabryka.przyklad.produkt.TypProduktu;

public abstract class Fabryka {
    public abstract Produkt utworzProdukt(TypProduktu typ) throws Exception;
}
