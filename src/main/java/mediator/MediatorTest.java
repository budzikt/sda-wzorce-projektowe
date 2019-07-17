package mediator;

public class MediatorTest {
    public static void main(String[] args) {

        Mediator m = new KonkretnyMediator();
        Kolega kolegaRandom1 = new KonkretnyKolega(0.1f, m);
        Kolega kolegaRandom2 = new KonkretnyKolega(0.1f, m);
        Kolega kolegaRandom3 = new KonkretnyKolega(0.9f, m);

        m.addKolega(kolegaRandom1);
        m.addKolega(kolegaRandom2);
        m.addKolega(kolegaRandom3);

        kolegaRandom1.doAction();
        kolegaRandom2.doAction();
        kolegaRandom3.doAction();

        System.out.println(m.wynikMediacji());
    }
}
