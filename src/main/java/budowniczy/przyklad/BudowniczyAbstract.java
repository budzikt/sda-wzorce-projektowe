package budowniczy.przyklad;

public abstract class BudowniczyAbstract {

    protected Produkt prototype;
    public abstract BudowniczyAbstract utworz();

    public abstract BudowniczyAbstract ustawPole1(int wartosc);

    public abstract BudowniczyAbstract ustawPole2(int wartosc);

    public abstract BudowniczyAbstract ustawPole3(int wartosc);

    public abstract BudowniczyAbstract ustawPole4(int wartosc);

    public abstract BudowniczyAbstract ustawPole5(int wartosc);

    public BudowniczyAbstract ustawPole6() {
        this.prototype.setPoleZawsze100(100);
        return this;
    }

    public abstract Produkt pobierzProdukt();
}
