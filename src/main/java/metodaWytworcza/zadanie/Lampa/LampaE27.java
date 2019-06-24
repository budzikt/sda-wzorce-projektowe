package metodaWytworcza.zadanie.Lampa;

import metodaWytworcza.zadanie.Zarowka.Zarowka;
import metodaWytworcza.zadanie.Zarowka.ZarowkaE27;

public class LampaE27 extends Lampa {

    public LampaE27(int moc) {
        super(moc);
        this.typ = "Lampa z gwintem typu E27";
    }

    @Override
    protected Zarowka generateZarowka(int moc) {
        return new ZarowkaE27(moc);
    }
}
