package lancuchZobowiazan.przyklad.lancuch;

public class HandlerDodawanie extends Handler {


    public HandlerDodawanie(Handler next, int liczba) {
        super(next, liczba);
    }

    public HandlerDodawanie(int liczba) {
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
        return liczba + this.liczba;
    }
}
