package budowniczy.przyklad;

public class BudowniczyRazyDwa extends BudowniczyAbstract {

    @Override
    public BudowniczyAbstract utworz() {
        prototype = new Produkt();
        return this;
    }

    @Override
    public BudowniczyAbstract ustawPole1(int wartosc) {
        prototype.setPole1(wartosc * 2);
        return this;
    }

    @Override
    public BudowniczyAbstract ustawPole2(int wartosc) {
        prototype.setPole2(wartosc * 2);
        return this;
    }

    @Override
    public BudowniczyAbstract ustawPole3(int wartosc) {
        prototype.setPole3(wartosc * 2);
        return this;
    }

    @Override
    public BudowniczyAbstract ustawPole4(int wartosc) {
        prototype.setPole4(wartosc * 2);
        return this;
    }

    @Override
    public BudowniczyAbstract ustawPole5(int wartosc) {
        prototype.setPole5(wartosc * 2);
        return this;
    }

    @Override
    public Produkt pobierzProdukt() {
        return prototype;
    }
}
