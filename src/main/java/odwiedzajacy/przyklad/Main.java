package odwiedzajacy.przyklad;


import odwiedzajacy.przyklad.odwiedzajacy.Odwiedzajacy;
import odwiedzajacy.przyklad.odwiedzajacy.OdwiedzajacyKonkretny;
import odwiedzajacy.przyklad.odwiedzany.KonkretnyOdwiedzany1;
import odwiedzajacy.przyklad.odwiedzany.KonkretnyOdwiedzany2;
import odwiedzajacy.przyklad.odwiedzany.Odwiedzany;

public class Main {
    public static void main(String[] args) {
        Odwiedzajacy odwiedzajact = new OdwiedzajacyKonkretny();

        Odwiedzany odw1 = new KonkretnyOdwiedzany1();
        Odwiedzany odw2 = new KonkretnyOdwiedzany2();

        odw1.przyjmijOdwiedzającego(odwiedzajact);
        odw2.przyjmijOdwiedzającego(odwiedzajact);
    }
}
