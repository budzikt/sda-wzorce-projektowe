package metodaWytworcza.przyklad.producent;

import metodaWytworcza.przyklad.produkt.Product;

public abstract  class Wytworca {

    /*TU JEST WZORZEC*/
    private Product produkt;

    public Wytworca(String nazwa) {
        /*TU JEST WZORZEC*/
        this.produkt = this.wytworzProdukt(nazwa);
    }

    /*TU JEST WZORZEC*/
    protected abstract Product wytworzProdukt(String s);


    public String pobierzNazweProduktu() {
        return this.produkt.getName();
    }

}
