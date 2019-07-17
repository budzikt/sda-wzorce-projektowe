package lancuchZobowiazan.przyklad.lancuch;

public class HandlerMnozenie extends Handler {

    public HandlerMnozenie(Handler next, int liczba) {
        super(next, liczba);
    }

    public HandlerMnozenie(int liczba) {
        super(liczba);
    }

    @Override
    public int dzialanie(int liczba1) {
        if(this.next != null) {
            return next.dzialanie(this.licz(liczba1));
        } else {
            return this.licz(liczba1);
        }
    }

    @Override
    protected int licz(int liczba) {
        return this.liczba * liczba;
    }
}
