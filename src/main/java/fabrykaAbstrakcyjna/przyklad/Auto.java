package fabrykaAbstrakcyjna.przyklad;

import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;

public class Auto {
    private String nazwa;
    private Kolo kolo;
    private Lusterko lusterko;

    public Auto(String nazwa, Kolo kolo, Lusterko lusterko) {
        this.nazwa = nazwa;
        this.kolo = kolo;
        this.lusterko = lusterko;
    }

    @Override
    public String toString() {
        return "Jestem autem " + this.nazwa + "\nSkladam sie z:\n-" + kolo.toString() + "\n-" + lusterko.toString();
    }
}
