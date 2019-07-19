package budowniczy.przyklad.budowniczy;

import budowniczy.przyklad.Produkt;

public class BudowniczyRazyDwa extends Budowniczy {

    @Override
    public Budowniczy utworz() {
        prototype = new Produkt();
        return this;
    }

    @Override
    public Budowniczy ustawPole1(int wartosc) {
        prototype.setPole1(wartosc * 2);
        return this;
    }

    @Override
    public Budowniczy ustawPole2(int wartosc) {
        prototype.setPole2(wartosc * 2);
        return this;
    }

    @Override
    public Budowniczy ustawPole3(int wartosc) {
        prototype.setPole3(wartosc * 2);
        return this;
    }

    @Override
    public Budowniczy ustawPole4(int wartosc) {
        prototype.setPole4(wartosc * 2);
        return this;
    }

    @Override
    public Budowniczy ustawPole5(int wartosc) {
        prototype.setPole5(wartosc * 2);
        return this;
    }

    @Override
    public Produkt pobierzProdukt() {
        return prototype;
    }
}
