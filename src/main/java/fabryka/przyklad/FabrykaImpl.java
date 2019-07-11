package fabryka.przyklad;

import fabryka.przyklad.produkt.KonkretnyProdukt1;
import fabryka.przyklad.produkt.KonkretnyProdukt2;
import fabryka.przyklad.produkt.Produkt;
import fabryka.przyklad.produkt.TypProduktu;

public class FabrykaImpl extends Fabryka {
    public FabrykaImpl() {
    }

    /*TU JEST WZORZEC*/
    public Produkt utworzProdukt(TypProduktu typ) throws Exception {

        switch (typ) {
            case PRODUKT_1:{
                return new KonkretnyProdukt1("Produkt 1");
            }
            case PRODUKT_2:{
                return new KonkretnyProdukt2("Produkt 2");
            } default: {
                throw  new Exception("Nie mamy takiego produktu!");
            }
        }

    }
}
