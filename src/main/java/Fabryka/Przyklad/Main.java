package Fabryka.Przyklad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produkt> listaProduktow = new ArrayList<Produkt>();
        Fabryka f = new Fabryka();

        try {
            Produkt p1 = f.utworzProdukt(TypProduktu.PRODUKT_1);
            listaProduktow.add(p1);
            Produkt p2 = f.utworzProdukt(TypProduktu.PRODUKT_2);
            listaProduktow.add(p2);

            /*Boom*/
            // Produkt p3 = f.utworzProdukt(TypProduktu.TEGO_JESZCZE_NIE_MAMY);
            //listaProduktow.add(p3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for(Produkt p : listaProduktow) {
            System.out.println(p.getNazwa());
        }



    }
}
