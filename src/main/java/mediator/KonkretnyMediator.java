package mediator;

public class KonkretnyMediator extends Mediator {

    private boolean stanWszystkich;

    @Override
    protected boolean mediate(Kolega kol) {
        boolean wszyscy = this.listaKolegow.stream()
                .allMatch(kolega -> kolega.stan == true);
        this.stanWszystkich = wszyscy;
        return wszyscy;
    }

    @Override
    public boolean wynikMediacji() {
        return this.stanWszystkich;
    }
}
