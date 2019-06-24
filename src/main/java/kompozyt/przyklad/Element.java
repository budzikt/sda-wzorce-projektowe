package kompozyt.przyklad;

public class Element extends Komponent {


    @Override
    public Komponent pobierzDziecko(int idx) {
        return null;
    }

    @Override
    public void dodajDziecko(Komponent k) {

    }

    @Override
    public void usunDziecko(int idx) {

    }

    @Override
    public String wykonajAkcje() {
        return "Wykonuje akcje na końcowym elemencie!";
    }
}
