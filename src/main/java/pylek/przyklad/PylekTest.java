package pylek.przyklad;

public class PylekTest {
    public static void main(String[] args) {

        /*Pusty magazyn*/
        MagazynPylkow magazyn = new MagazynPylkow();

        /*3 klasy klienckie*/
        UzytkownikPylka user1 = new UzytkownikPylka(1, 40);
        UzytkownikPylka user2 = new UzytkownikPylka(1, 50);
        UzytkownikPylka user3 = new UzytkownikPylka(2, 5);

        magazyn.ustawPylekUzytkownika(user1);
        magazyn.ustawPylekUzytkownika(user2);

        /*Funkcje uzywające danych pylka*/
        UzyjDanychPylka uzytkownik1 = (p, idx) -> {
            return p.getDaneByIdx(idx) * 5;
        };
        UzyjDanychPylka uzytkownik2 = (p, idx) -> {
            return p.getDaneByIdx(idx) * 10;
        };

        /*Klasy klienckie uzywaja tego samego pyllka ale innego indeksu danych. */
        /*Przetwarzaja wybrane dane inaczej za pomoca funkcji typu UzyjDanychPylka*/
        try {
            System.out.println(user1.uzyjPylka(uzytkownik1));
            System.out.println(user1.uzyjPylka(uzytkownik2));
            System.out.println(user2.uzyjPylka(uzytkownik1));
            System.out.println(user2.uzyjPylka(uzytkownik2));
        } catch (Exception e) {

        }

    }
}
