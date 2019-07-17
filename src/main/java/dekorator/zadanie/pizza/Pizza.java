package dekorator.zadanie.pizza;

public abstract class Pizza {
    protected int cena;

    public abstract int podajCene();
    public abstract int pobierzIloscSkladnikw();

    public void jakSmakuje() {
        System.out.println("Jest pyszna");
    }

}
