package adapter.przyklad;

import adapter.przyklad.pakiet.innej.firmy.AdaptowanaKlasa;

public class Test {

    public static void main(String[] args) {

        final String tekst = "TeksT do WyPisaNia";
        final int ileGwiazdek = 5;


        AdaptowanaKlasa ak = new AdaptowanaKlasa();
        AdapterSystemu adapter = new AdapterSystemu(ak, ileGwiazdek);


        System.out.println("Bez adaptera:");
        System.out.println(ak.dodajGwiazdki(tekst, ileGwiazdek));

        System.out.println("\nZ adapteram:");
        System.out.println(adapter.wypiszDuzeLitery(tekst));
    }
}
