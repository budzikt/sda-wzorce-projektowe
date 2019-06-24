package metodaWytworcza.przyklad.produkt;

public class ProduktKonkretny extends Product {

    public ProduktKonkretny(String name) {
        super(name);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " i jestem produktem konkretnym";
    }
}
