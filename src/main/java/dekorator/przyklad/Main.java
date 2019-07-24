package dekorator.przyklad;

public class Main {
    public static void main(String[] args) {

        Dekorowalny el = new Element(10);
        DekoratorKonkretny dk = new DekoratorKonkretny(5, el);
        DekoratorKonkretny dk2 = new DekoratorKonkretny(7, dk);
        System.out.println(dk2.pobierzCene());
        dk2.wykonajAkcje();
    }
}
