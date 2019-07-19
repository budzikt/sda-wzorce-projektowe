package budowniczy.przyklad;

import budowniczy.przyklad.budowniczy.BudowniczyNormalny;
import budowniczy.przyklad.budowniczy.BudowniczyRazyDwa;

public class Main {
    public static void main(String[] args) throws Exception {

        Zarzadca z = new Zarzadca();
        BudowniczyNormalny b = new BudowniczyNormalny();
        z.setBudowniczy(b);

        Produkt p = z.zbudujMiProdukt();
        System.out.println(p.toString());

        p = z.zbudujMiProdukt(new int[] {8,3,6,2,7});
        System.out.println(p.toString());

        z.setBudowniczy(new BudowniczyRazyDwa());

        p = z.zbudujMiProdukt(new int[] {4,2,9,8,1});
        System.out.println(p.toString());

    }
}
