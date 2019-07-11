package fabrykaAbstrakcyjna.przyklad;

import fabrykaAbstrakcyjna.przyklad.produkty.Material;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaAbstrakcyjna;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaSportowa;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaTerenowa;

public class Main {
    public static void main(String[] args) {

        FabrykaAbstrakcyjna f = new FabrykaSportowa();
        Kolo k = f.getKolo(Material.KOMPOZYT);
        Lusterko l = f.getLusterko(Material.STAL);
        Auto autoSportowe = new Auto("Sportowe", k, l);
        System.out.println(autoSportowe.toString());

        f = new FabrykaTerenowa();
        k = f.getKolo(Material.STAL);
        l = f.getLusterko(Material.KOMPOZYT);
        Auto autoTerenowe = new Auto("Terenowe", k,l);
        System.out.println(autoTerenowe.toString());

    }
}
