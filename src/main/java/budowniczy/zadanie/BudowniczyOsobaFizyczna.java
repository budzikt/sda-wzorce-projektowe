package budowniczy.zadanie;

public class BudowniczyOsobaFizyczna extends Budowniczy {

    @Override
    public Budowniczy dodajDaneBiznesowe(String regon, Long nip) {
        return this;
    }

    @Override
    public boolean czyDaneOsoboweKompletne() {
        return true;
    }

}
