package fabrykaAbstrakcyjna.przyklad;

import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;

public class Auto {
    private Kolo kolo;
    private Lusterko lusterko;

    public Auto(Kolo kolo, Lusterko lusterko) {
        this.kolo = kolo;
        this.lusterko = lusterko;
    }

    @Override
    public String toString() {
        return "Skladam sie z " + kolo.toString() + " oraz " + lusterko.toString();
    }
}
