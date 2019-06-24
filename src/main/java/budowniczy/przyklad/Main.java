package budowniczy.przyklad;

public class Main {
    public static void main(String[] args) {

        Zarzadca z = new Zarzadca();
        BudowniczyNormalny b = new BudowniczyNormalny();
        z.setBudowniczy(b);

        Produkt p = z.zbudujMiProdukt();
        System.out.println(p.toString());
        z.setBudowniczy(new BudowniczyRazyDwa());
        p = z.zbudujMiProdukt();
        System.out.println(p.toString());



    }
}
