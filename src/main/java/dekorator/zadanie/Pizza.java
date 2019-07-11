package dekorator.zadanie;

public abstract class Pizza {
    protected int cena;
    protected int liczbaSkladnikow;

    public abstract int podajCene();
    public abstract int pobierzIloscSkladnikw();

    public void jakSmakuje() {
        System.out.println("Jest pyszna");
    }

}
