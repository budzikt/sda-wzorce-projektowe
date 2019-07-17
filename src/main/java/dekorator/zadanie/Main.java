package dekorator.zadanie;

import dekorator.zadanie.dekoratory.Ser;
import dekorator.zadanie.dekoratory.Szyneczka;
import dekorator.zadanie.pizza.Pizza;
import dekorator.zadanie.pizza.PizzaImpl;

public class Main {
    public static void main(String[] args) {

        Pizza golaPizza = new PizzaImpl(12);
        Pizza pizzaZSzynka = new Szyneczka(golaPizza, 5);
        Pizza pizzaSzynkaSer = new Ser(pizzaZSzynka, 2);

        /* Lepiej */
        Pizza pizzaSzynkaSer2 = new Ser(new Szyneczka(new PizzaImpl(19), 2), 5);

        System.out.println(pizzaSzynkaSer.podajCene());
        System.out.println(pizzaSzynkaSer.pobierzIloscSkladnikw());
        pizzaSzynkaSer.jakSmakuje();

        Pizza pizzaBezSera = new Szyneczka(new PizzaImpl(15), 5);
        pizzaBezSera.jakSmakuje();
    }


}
