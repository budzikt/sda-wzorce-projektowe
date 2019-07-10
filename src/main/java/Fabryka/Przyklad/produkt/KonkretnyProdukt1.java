package fabryka.przyklad.produkt;


public class KonkretnyProdukt1
        extends Produkt {

    public KonkretnyProdukt1(String nazwa) {
        super(nazwa);
    }

    @Override
    public void metodaAbstrakcyjnaProduktu() {
        System.out.println("Metoda produktu konkretnego 1");
    }
}
