package budowniczy.przyklad;

public class Zarzadca {
    private BudowniczyAbstract budowniczy;

    public void setBudowniczy(BudowniczyAbstract budowniczyNormalny) {
        this.budowniczy = budowniczyNormalny;
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
}
