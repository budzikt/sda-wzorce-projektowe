package budowniczy.przyklad.budowniczy;

import budowniczy.przyklad.Produkt;

public class BudowniczyNormalny extends Budowniczy {



    public BudowniczyNormalny utworz() {
        this.prototype = new Produkt();
        return this;
    }

    public BudowniczyNormalny ustawPole1(int wartosc){
        this.prototype.setPole1(wartosc);
        return this;
    }

    public BudowniczyNormalny ustawPole2(int wartosc){
        this.prototype.setPole2(wartosc);
        return this;
    }

    public BudowniczyNormalny ustawPole3(int wartosc){
        this.prototype.setPole3(wartosc);
        return this;
    }

    public BudowniczyNormalny ustawPole4(int wartosc){
        this.prototype.setPole4(wartosc);
        return this;
    }

    public BudowniczyNormalny ustawPole5(int wartosc){
        this.prototype.setPole5(wartosc);
        return this;
    }

    public Produkt pobierzProdukt() {
        return this.prototype;
    }


}
