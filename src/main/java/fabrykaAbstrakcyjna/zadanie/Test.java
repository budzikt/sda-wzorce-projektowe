package fabrykaAbstrakcyjna.zadanie;

import fabrykaAbstrakcyjna.zadanie.fabryka.Fabryka;
import fabrykaAbstrakcyjna.zadanie.fabryka.FabrykaDrewniana;
import fabrykaAbstrakcyjna.zadanie.fabryka.FabrykaKamienna;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Fabryka fabrykaOsiedleDrewniane = new FabrykaDrewniana();
        Fabryka fabrykaOsiedleKamienne = new FabrykaKamienna();

        List<Dom> osiedleDrewniane = budujOsiedle(fabrykaOsiedleDrewniane);
        List<Dom> osiedleKamienne = budujOsiedle(fabrykaOsiedleKamienne);

    }

    public static List<Dom> budujOsiedle(Fabryka f) {
        List<Dom> osiedle = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            Dom d = new Dom();
            d.setDrzwi(f.getDrzwi());
            d.setOkna(f.getOkno());
            d.setSciany(f.getSciana(2000, 200, 600));
        }

        return osiedle;
    }
}
