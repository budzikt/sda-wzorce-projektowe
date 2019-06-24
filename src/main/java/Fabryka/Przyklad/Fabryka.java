package Fabryka.Przyklad;

public class Fabryka {
    public Fabryka() {
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
