package most.Zadanie2;

public abstract class Silnik {
    protected int cylindry;
    protected int pojemnosc;

    protected int obecneObroty;

    public Silnik(int cylindry, int pojemnosc) {
        this.cylindry = cylindry;
        this.pojemnosc = pojemnosc;
        this.obecneObroty = 0;
    }

    public abstract int dodajGazu();


}
