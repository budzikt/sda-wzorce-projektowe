package dekorator.zadanie.dekoratory;

import dekorator.zadanie.pizza.Pizza;

public class Ser extends DekoratorPizzy {

    public Ser(Pizza pizza, int cena) {
        super(pizza, cena);
    }

    @Override
    public void jakSmakuje() {
        super.jakSmakuje();
        System.out.println(" i bardzo sie ciagnie\n");
    }
}
