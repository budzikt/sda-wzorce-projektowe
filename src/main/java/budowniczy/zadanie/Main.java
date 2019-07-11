package budowniczy.zadanie;

public class Main {

    public static void main(String[] args) {
        Budowniczy b = new BudowniczyVat();
        Zarzadca z = new Zarzadca(b);
        z.dodajDaneOgolne("Jan", "Kowalski", 98989898L)
                .dodajDaneBiznesowe("120938", 123456789L)
                .dodajDaneOsobowe("Tego nie wolno robic");

        DaneOsobowe dane1 = z.pobierzDaneOsobowe();
        System.out.println(dane1.toString());

    }
}
