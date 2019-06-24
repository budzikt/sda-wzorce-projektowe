package metodaSzablonowa;

import metodaSzablonowa.mail.bot.MailBot;
import metodaSzablonowa.mail.bot.NowyKlientMailBot;

public class MetodaSzabonowaMain {
    public static void main(String[] args) {

        MailBot nowy = new NowyKlientMailBot("Sprawdz nasza nowa oferte!");

        System.out.println(nowy.napiszMailing());

    }
}
