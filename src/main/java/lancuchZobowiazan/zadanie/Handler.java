package lancuchZobowiazan.zadanie;

public abstract class Handler {
    public Handler nastepny;

    public Handler ustawNastepny(Handler nastepny){
        this.nastepny = nastepny;
        return this.nastepny;
    }

    public abstract String obsluz(int predkosc);
}
