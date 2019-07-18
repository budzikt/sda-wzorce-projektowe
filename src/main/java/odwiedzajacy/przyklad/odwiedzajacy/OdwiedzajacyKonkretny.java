package odwiedzajacy.przyklad.odwiedzajacy;

import odwiedzajacy.przyklad.odwiedzany.KonkretnyOdwiedzany1;
import odwiedzajacy.przyklad.odwiedzany.KonkretnyOdwiedzany2;

public class OdwiedzajacyKonkretny extends Odwiedzajacy {
    @Override
    public void odwiedzKonkretnego(KonkretnyOdwiedzany1 kOdw) {
        System.out.println("Odwiedzam Konkretnego Ogdiwedzanego");
    }

    @Override
    public void odwiedzKonkretnego2(KonkretnyOdwiedzany2 kOdw) {
        System.out.println("Odwiedzam Konkretnego Ogdiwedzanego 2");
    }
}
