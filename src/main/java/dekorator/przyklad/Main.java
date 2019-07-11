package dekorator.przyklad;

public class Main {
    public static void main(String[] args) {
        Dekorowalny el = new Element(10);
        DekoratorKonkretny dk = new DekoratorKonkretny(5, el);
        System.out.println(dk.pobierzCene());
        dk.wykonajAkcje();
    }
}
