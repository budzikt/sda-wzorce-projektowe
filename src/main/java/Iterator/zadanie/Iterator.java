package Iterator.zadanie;

public abstract class Iterator {
    public abstract boolean maKolejnyElement();
    public abstract Kwiat pobiezElement();
    public abstract boolean czyKoniec();
    public abstract void nastepny() throws Exception;

}
