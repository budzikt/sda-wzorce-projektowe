package metodaWytworcza.zadanie.Lampa;

import metodaWytworcza.zadanie.Zarowka.Zarowka;

public abstract class Lampa {

    private Zarowka zarowka;
    protected String typ;

    public Lampa(int moc) {
        this.typ = "Nieznany typ lampy";
        this.zarowka = this.generateZarowka(moc);
    }

    protected abstract Zarowka generateZarowka(int moc);

    public String przedstawSie() {
        return "Jestem lampą typu " + this.typ + " i mam zarowke typu: " +this.zarowka.getTypGwintu();
    }

    public void wlacz() {
        System.out.println("Wlaczyles lampe " + this.przedstawSie());
    }

    public void wylacz() {
        System.out.println("Wylaczyles lampe " + this.przedstawSie());
    }
}
