package kompozyt.przyklad;

public abstract class Komponent {
    public abstract Komponent pobierzDziecko(int idx);
    public abstract void dodajDziecko(Komponent k);
    public abstract void usunDziecko(int idx);
    public abstract String wykonajAkcje();
}
