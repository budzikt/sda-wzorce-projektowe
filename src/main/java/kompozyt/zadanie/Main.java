package kompozyt.zadanie;

public class Main {
    public static void main(String[] args) {
        Karton karton = new Karton(0);

        Karton kartonKurczaki = new Karton(1);
        kartonKurczaki.dodajDziecko(new Kurczak());
        kartonKurczaki.dodajDziecko(new Kurczak());
        kartonKurczaki.dodajDziecko(new Kurczak());

        karton.dodajDziecko(kartonKurczaki);

        System.out.println(karton.wykonajAkcje());

    }
}
