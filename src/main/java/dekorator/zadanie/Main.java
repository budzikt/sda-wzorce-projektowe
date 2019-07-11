package dekorator.zadanie;

public class Main {
    public static void main(String[] args) {

        Pizza golaPizza = new PizzaImpl(12);
        Pizza pizzaZSzynka = new Szyneczka(golaPizza);
        Pizza pizzaSzynkaSer = new Ser(pizzaZSzynka);

        /* Lepiej */
        Pizza pizzaSzynkaSer2 = new Ser(new Szyneczka(new PizzaImpl(19)));

        System.out.println(pizzaSzynkaSer.podajCene());
        System.out.println(pizzaSzynkaSer.pobierzIloscSkladnikw());
        pizzaSzynkaSer.jakSmakuje();

        Pizza pizzaBezSera = new Szyneczka(new PizzaImpl(15));
        pizzaBezSera.jakSmakuje();
    }


}
