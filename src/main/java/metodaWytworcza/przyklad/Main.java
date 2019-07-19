package metodaWytworcza.przyklad;

import metodaWytworcza.przyklad.producent.KonkretnyWytworca;
import metodaWytworcza.przyklad.producent.Wytworca;
import metodaWytworcza.przyklad.produkt.Product;

public class Main {
    public static void main(String[] args) {

        Wytworca wytw = new KonkretnyWytworca("Produkt1");
        System.out.println("Nic nie zrobiłem, a mam dobry produkt:");
        System.out.println(wytw.pobierzNazweProduktu());
    }
}
