package fabryka.przyklad.produkt;


public class KonkretnyProdukt2 extends Produkt {

    public KonkretnyProdukt2(String nazwa) {
        super(nazwa);
    }

    @Override
    public void metodaAbstrakcyjnaProduktu() {
        System.out.println("Metoda produktu konkretnego 2");
    }
}
