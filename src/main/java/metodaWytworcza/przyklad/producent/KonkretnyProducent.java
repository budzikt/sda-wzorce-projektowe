package metodaWytworcza.przyklad.producent;

import metodaWytworcza.przyklad.produkt.Product;
import metodaWytworcza.przyklad.produkt.ProduktKonkretny;

public class KonkretnyProducent extends Producent {

    /*TU JEST WZORZEC*/
    @Override
    protected Product wytworzProdukt() {
        return new ProduktKonkretny("Konkretny Produkt");
    }
}
