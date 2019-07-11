package budowniczy.zadanie.budowniczy;

public class BudowniczyVat extends Budowniczy{

    public BudowniczyVat() {
        super();
        this.prototyp.setVatPayer(true);
    }

    @Override
    public boolean czyDaneOsoboweKompletne() {
        return true;
    }

    @Override
    public Budowniczy dodajDaneOsobowe(String przezwisko) {
        return this;
    }
}
