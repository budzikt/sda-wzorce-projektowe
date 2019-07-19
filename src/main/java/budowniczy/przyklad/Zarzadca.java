package budowniczy.przyklad;

import budowniczy.przyklad.budowniczy.Budowniczy;

public class Zarzadca {
    private Budowniczy budowniczy;

    public void setBudowniczy(Budowniczy bud) {
        this.budowniczy = bud;
    }

    public Produkt zbudujMiProdukt() {
        return budowniczy.utworz()
                .ustawPole1(1)
                .ustawPole2(2)
                .ustawPole3(3)
                .ustawPole4(4)
                .ustawPole5(5)
                .pobierzProdukt();
    }

    public Produkt zbudujMiProdukt(int[] arrInt) throws Exception {
        if(arrInt.length != 5) {
            throw new Exception("Za malo/duzo argumentow");
        }
        return budowniczy.utworz()
                .ustawPole1(arrInt[0])
                .ustawPole2(arrInt[1])
                .ustawPole3(arrInt[2])
                .ustawPole4(arrInt[3])
                .ustawPole5(arrInt[4])
                .pobierzProdukt();
    }
}
