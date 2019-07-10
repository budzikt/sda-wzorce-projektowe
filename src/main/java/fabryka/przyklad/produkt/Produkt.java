package fabryka.przyklad.produkt;

public abstract class Produkt {
    String nazwa;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract void metodaAbstrakcyjnaProduktu();

}
