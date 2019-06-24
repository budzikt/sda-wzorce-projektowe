package fabrykaAbstrakcyjna.przyklad;

import fabrykaAbstrakcyjna.przyklad.Auto;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaAbstrakcyjna;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaSportowa;
import fabrykaAbstrakcyjna.przyklad.produkty.kola.Kolo;
import fabrykaAbstrakcyjna.przyklad.produkty.listerka.Lusterko;
import fabrykaAbstrakcyjna.przyklad.fabryki.FabrykaTerenowa;
import fabrykaAbstrakcyjna.przyklad.produkty.Material;

public class Main {
    public static void main(String[] args) {

        FabrykaAbstrakcyjna f = new FabrykaSportowa();
        Kolo k = f.getKolo(Material.KOMPOZYT);
        Lusterko l = f.getLusterko(Material.STAL);
        Auto autoSportowe = new Auto(k, l);
        System.out.println(autoSportowe.toString());

        f = new FabrykaTerenowa();
        k = f.getKolo(Material.STAL);
        l = f.getLusterko(Material.KOMPOZYT);
        Auto autoTerenowe = new Auto(k,l);
        System.out.println(autoTerenowe.toString());

    }
}
