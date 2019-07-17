package metodaSzablonowa.zadanie;

import metodaSzablonowa.zadanie.bot.MailBot;
import metodaSzablonowa.zadanie.bot.NowyKlientMailBot;

public class MetodaSzabonowaMain {
    public static void main(String[] args) {

        MailBot nowy = new NowyKlientMailBot("Sprawdz nasza nowa oferte!");

        System.out.println(nowy.napiszMailing());

    }
}
