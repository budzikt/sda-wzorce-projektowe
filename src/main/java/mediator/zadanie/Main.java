package mediator.zadanie;

import mediator.zadanie.elementKolejowy.ElementKolejowy;
import mediator.zadanie.elementKolejowy.Rogatka;

public class Main {
    public static void main(String[] args) {
        MediatorKolejowy m = new MediatorKolejowy();

        ElementKolejowy r1 = new Rogatka(m, 1);

        r1.wykonajAkcjeJedz();
        System.out.println(m.getWynikMediacji());
        r1.wykonajAkcjeJedz();
        System.out.println(m.getWynikMediacji());
        r1.wykonajAkcjeJedz();
        System.out.println(m.getWynikMediacji());
        r1.wykonajAkcjeJedz();
        System.out.println(m.getWynikMediacji());
        r1.wykonajAkcjeJedz();
        System.out.println(m.getWynikMediacji());


    }
}
