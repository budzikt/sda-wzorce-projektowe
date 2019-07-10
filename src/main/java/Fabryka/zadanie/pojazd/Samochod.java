package fabryka.zadanie.pojazd;

public class Samochod extends Pojazd {

    public Samochod(String kolor) {
        super(kolor);
    }

    @Override
    public void drive() {
        System.out.println("Wroom wroom");
    }
}
