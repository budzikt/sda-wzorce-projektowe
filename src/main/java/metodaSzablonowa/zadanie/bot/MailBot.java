package metodaSzablonowa.zadanie.bot;

public abstract class MailBot {

    private String glownaTresc;

    /*TU JEST WZORZEC*/
    public String napiszMailing() {
        return napiszNaglowek()
                + '\n'
                + napiszTresc()
                + '\n'
                + napiszStopke();
    }

    public MailBot() {
        this.glownaTresc = "Niezdefiniowana glowna tresc maila";
    }

    protected MailBot(String glownaTresc){
        this.glownaTresc = glownaTresc;
    }
    /*TU JEST WZPORZEC*/
    protected abstract String napiszNaglowek();
    /*TU JEST WZPORZEC*/
    protected abstract String napiszStopke();
    protected String napiszTresc() {
        return this.glownaTresc;
    }

}
