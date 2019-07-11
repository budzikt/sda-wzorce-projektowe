package budowniczy.zadanie;

import budowniczy.zadanie.budowniczy.Budowniczy;
import budowniczy.zadanie.budowniczy.BudowniczyOsobaFizyczna;
import budowniczy.zadanie.budowniczy.BudowniczyVat;

public class Main {

    public static void main(String[] args) {
        Budowniczy b = new BudowniczyVat();
        Zarzadca z = new Zarzadca(b);
        z.dodajDaneOgolne("Jan", "Kowalski", 98989898L)
            .dodajDaneBiznesowe("120938", 123456789L)
            .dodajDaneOsobowe("Tego nie wolno robic");

        DaneOsobowe dane1 = z.pobierzDaneOsobowe();
        System.out.println(dane1.toString());

        z.zmienBuildera(new BudowniczyOsobaFizyczna());
        z.dodajDaneOgolne("Anna", "Kwiatkowska", 11111111L)
            .dodajDaneBiznesowe("Bez sensu", 77777777L)
            .dodajDaneOsobowe("Dżaga");

        DaneOsobowe dane2 = z.pobierzDaneOsobowe();
        System.out.println(dane2.toString());

    }
}
