package metodaWytworcza.przyklad.producent;

import metodaWytworcza.przyklad.produkt.Product;
import metodaWytworcza.przyklad.produkt.ProduktKonkretny;

public class KonkretnyWytworca extends Wytworca {

    public KonkretnyWytworca(String nazwa) {
        super(nazwa);
    }

    @Override
    protected Product wytworzProdukt(String s) {
        return new ProduktKonkretny(s);
    }
}
