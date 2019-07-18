package mediator.przyklad.mediator;

import mediator.przyklad.kolega.Kolega;

public class KonkretnyMediator extends Mediator {

    @Override
    public boolean mediuj(Kolega kol) {
        boolean wszyscy = this.listaKolegow.stream()
                .allMatch(kolega -> kolega.getStan() == true);
        this.wynikMediacji = wszyscy;
        return wszyscy;
    }

    @Override
    public String wypiszOczekiwanyWynik() {
        return "Chce, aby wszyscy moi koledzy byli true";
    }
}
