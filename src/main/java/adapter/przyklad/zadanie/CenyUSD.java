package adapter.przyklad.zadanie;

public class CenyUSD extends  SystemCenowy {

    private CenyIkea adaptee;
    private Float kurs;

    public CenyUSD(CenyIkea adaptee, Float kurs) {
        this.adaptee = adaptee;
        this.kurs = kurs;
    }

    @Override
    public Float wyliczCene(Float dlugoscMetry) {
        Float mm = dlugoscMetry * 1000;
        return (float)(this.kurs * this.adaptee.cenaSzwedzka(mm));
    }
}
