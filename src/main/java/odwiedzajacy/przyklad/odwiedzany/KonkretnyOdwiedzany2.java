package odwiedzajacy.przyklad.odwiedzany;

import odwiedzajacy.przyklad.odwiedzajacy.Odwiedzajacy;

public class KonkretnyOdwiedzany2 extends Odwiedzany {
    @Override
    public void przyjmijOdwiedzającego(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.odwiedzKonkretnego2(this);
    }
}
