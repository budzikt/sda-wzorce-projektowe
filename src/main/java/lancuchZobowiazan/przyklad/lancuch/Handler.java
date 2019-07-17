package lancuchZobowiazan.przyklad.lancuch;

public abstract class Handler {

    protected Handler next;
    protected int liczba;

    public Handler(Handler next, int liczba) {
        this.next = next;
        this.liczba = liczba;
    }

    public Handler(int liczba) {
        this.liczba = liczba;
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract int dzialanie(int liczba1);

    protected abstract int licz(int liczba);

}
