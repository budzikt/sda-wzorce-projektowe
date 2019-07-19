package odwiedzajacy.zadanie;

public class OdiwedzajactTest {
    public static void main(String[] args) {

        Odwiedzajacy odw = new Odwiedzajacy();
        PracownikAbs zwykly = new Pracownik(3000);
        PracownikAbs prezes = new Prezes(4500, 70000);

        System.out.println(zwykly.przyjmijOdwiedzajacego(odw));
        System.out.println(prezes.przyjmijOdwiedzajacego(odw));
    }
}

