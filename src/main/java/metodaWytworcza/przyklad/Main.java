package metodaWytworcza.przyklad;

import metodaWytworcza.przyklad.producent.KonkretnyProducent;
import metodaWytworcza.przyklad.producent.Producent;
import metodaWytworcza.przyklad.produkt.Product;

public class Main {
    public static void main(String[] args) {

        Producent p = new KonkretnyProducent();
        System.out.println("Nic nie zrobiłem, a mam dobry produkt:");
        System.out.println(p.jakiMamProdukt());
        System.out.println("Jak potrzebuje, to uzywam go poza producentem");
        Product product = p.getProdukt();
        System.out.println(product.getName());

    }
}
