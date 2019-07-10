package metodaWytworcza.zadanie.Zarowka;

public abstract class Zarowka {

    private int moc;
    protected String typGwintu;

    public Zarowka(int moc) {
        this.moc = moc;
        this.typGwintu = setTypGwintu();
    }

    protected abstract String setTypGwintu();

    public String getTypGwintu() {
        return typGwintu;
    }

    public int getMoc() {
        return moc;
    }

}
