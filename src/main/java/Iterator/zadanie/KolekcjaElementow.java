package Iterator.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KolekcjaElementow {
    private List<Kwiat> kwiatList;

    public KolekcjaElementow() {
        this.kwiatList = new ArrayList<Kwiat>();
    }

    public KolekcjaElementow dodajDoKolekcji(Kwiat it) {
        kwiatList.add(it);
        return this;
    }

    public int pobierzDlugoscKolekcji() {
        return this.kwiatList.size();
    }

    public Kwiat pobierzElement(int index) {
        return kwiatList.get(index);
    }

    public Kwiat pobierzKolejnyCzerownyElement(int idx) {
        Kwiat retKw = null;
        retKw = this.kwiatList.stream()
                .filter(e -> e.getKolor() == Kolor.CZERWONE.toString())
                .collect(Collectors.toList()).get(0);
        return retKw;
    }

    public Iterator pobierzIterator() {
        return new KonkretnyIterator(this);
    }

    public boolean maKolejnyCzerowny(int idx) {
        boolean ret = false;
        for(int i = idx; i < this.kwiatList.size(); i++) {
            if(this.kwiatList.get(idx).kolor == Kolor.CZERWONE) {
                ret = true;
            }
            else {
                ret = false;
            }
        }
        return  ret;
    }
}
