package odwiedzajacy.przyklad.odwiedzany;

import odwiedzajacy.przyklad.odwiedzajacy.Odwiedzajacy;

public class KonkretnyOdwiedzany1 extends Odwiedzany {

    @Override
    public void przyjmijOdwiedzającego(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.odwiedzKonkretnego(this);
    }
}
