package kompozyt.przyklad;

public class Element extends Komponent {

    private String nazwa;

    public Element(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public Komponent pobierzDziecko(int idx) {
        return this;
    }

    @Override
    public void dodajDziecko(Komponent k) {

    }

    @Override
    public void usunDziecko(int idx) {

    }

    @Override
    public String wykonajAkcje() {
        return "Wykonuje akcje na końcowym elemencie o nazwie " + this.nazwa;
    }
}
