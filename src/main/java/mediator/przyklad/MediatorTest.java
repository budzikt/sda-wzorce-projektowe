package mediator.przyklad;

import mediator.przyklad.kolega.Kolega;
import mediator.przyklad.kolega.KolegaNie;
import mediator.przyklad.kolega.KolegaTak;
import mediator.przyklad.kolega.LosowyKolega;
import mediator.przyklad.mediator.KonkretnyMediator;
import mediator.przyklad.mediator.KonkretnyMediatorSwap;
import mediator.przyklad.mediator.Mediator;
import mediator.przyklad.mediator.StrategiaMediacji;

public class MediatorTest {
    public static void main(String[] args) {

        Mediator mWszyscyTak = new KonkretnyMediator();
        Kolega kolegaRandom1 = new LosowyKolega(0.5f, mWszyscyTak);
        Kolega kolegaRandom2 = new LosowyKolega(0.5f, mWszyscyTak);
        Kolega kolegaRandom3 = new LosowyKolega(0.5f, mWszyscyTak);

        mWszyscyTak.addKolega(kolegaRandom1);
        mWszyscyTak.addKolega(kolegaRandom2);
        mWszyscyTak.addKolega(kolegaRandom3);

        kolegaRandom1.doActionAndNotify();
        kolegaRandom2.doActionAndNotify();
        kolegaRandom3.doActionAndNotify();

        System.out.println(mWszyscyTak.wynikMediacji());

        System.out.println("\n*******************************\n");

        StrategiaMediacji strategia = koledzy -> {
            if (koledzy.get(0).getStan() == true) {
                return true;
            } else {
                return false;
            }
        };

        Mediator mPierwszy = new KonkretnyMediatorSwap(strategia, "Chce, aby pierwszy kolega był w stanie true");


        Kolega kolegaTak = new KolegaTak(mPierwszy);
        Kolega kolegaNie = new KolegaNie(mPierwszy);

        mPierwszy.addKolega(kolegaTak);
        mPierwszy.addKolega(kolegaNie);

        kolegaTak.doActionAndNotify();
        kolegaNie.doActionAndNotify();
        System.out.println(mPierwszy.wynikMediacji());

    }
}
