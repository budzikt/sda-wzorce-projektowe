package kompozyt.przyklad;

public class  Test {
    public static void main(String[] args) {

        Komponent k = new KolekcjaElementow(1);
        k.dodajDziecko(new Element("A"));
        k.dodajDziecko(new Element("B"));

        Komponent podKomponent = new KolekcjaElementow(2);
        podKomponent.dodajDziecko(new Element("C"));
        podKomponent.dodajDziecko(new Element("D"));

        k.dodajDziecko(podKomponent);

        System.out.println(k.wykonajAkcje());

        System.out.println("\nUsuwamy elementy\n");

        k.usunDziecko(0);
        k.usunDziecko(1);

        System.out.println(k.wykonajAkcje());

    }
}
