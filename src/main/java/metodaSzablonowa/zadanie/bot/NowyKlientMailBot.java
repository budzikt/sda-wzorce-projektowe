package metodaSzablonowa.zadanie.bot;

public class NowyKlientMailBot extends MailBot {

    public NowyKlientMailBot(String glownaTresc) {
        super(glownaTresc);
    }

    public String napiszNaglowek() {
        return "Szanowny Panie/Pani";
    }

    public String napiszStopke() {
        return "Z wyrazami szacunku";
    }
}
