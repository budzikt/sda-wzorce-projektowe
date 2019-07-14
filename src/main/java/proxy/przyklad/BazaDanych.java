package proxy.przyklad;

public class BazaDanych implements OperacjaIfc {

    private int users;

    BazaDanych(int users) {
        this.users = users;
    }

    @Override
    public int pobierzLiczbeUzytkownikow() {
        return this.users;
    }

    @Override
    public void usunWszystko() {
        this.users = 0;
    }
}
