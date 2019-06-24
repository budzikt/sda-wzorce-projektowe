package dekorator.przyklad;

public class Element extends Dekorowalny {

    private int cena;

    @Override
    public int pobierzCene() {
        return this.cena;
    }

    @Override
    public void wykonajAkcje() {
        System.out.println("Wykonuje akcje na elemencie bazowym");
    }

    public Element(int cena) {
        this.cena = cena;
    }
}
