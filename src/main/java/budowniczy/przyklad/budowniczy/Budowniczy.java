package budowniczy.przyklad.budowniczy;

import budowniczy.przyklad.Produkt;

public abstract class Budowniczy {

    protected Produkt prototype;
    public abstract Budowniczy utworz();

    public abstract Budowniczy ustawPole1(int wartosc);
    public abstract Budowniczy ustawPole2(int wartosc);
    public abstract Budowniczy ustawPole3(int wartosc);
    public abstract Budowniczy ustawPole4(int wartosc);
    public abstract Budowniczy ustawPole5(int wartosc);

    public Budowniczy ustawPole6() {
        this.prototype.setPoleZawsze100(100);
        return this;
    }

    public abstract Produkt pobierzProdukt();
}
