package dekorator.zadanie.dekoratory;

import dekorator.zadanie.pizza.Pizza;

public class Szyneczka extends DekoratorPizzy {


    public Szyneczka(Pizza pizza, int cena) {
        super(pizza, cena);
    }


    @Override
    public int pobierzIloscSkladnikw() {
        return element.pobierzIloscSkladnikw() + 1;
    }
}
