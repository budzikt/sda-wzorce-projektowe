package fabrykaAbstrakcyjna.zadanie;

import fabrykaAbstrakcyjna.zadanie.element.drzwi.Drzwi;
import fabrykaAbstrakcyjna.zadanie.element.okno.Okno;
import fabrykaAbstrakcyjna.zadanie.element.sciana.Sciana;

import java.util.ArrayList;
import java.util.List;

public class Dom {
    List<Sciana> sciany;
    List<Drzwi> drzwi;
    List<Okno> okna;

    public Dom() {
        this.drzwi = new ArrayList<>();
        this.okna = new ArrayList<>();
        this.sciany = new ArrayList<>();
    }

    public void setSciany(Sciana sciana) {
        this.sciany.add(sciana);
    }

    public void setDrzwi(Drzwi drzwi) {
        this.drzwi.add(drzwi);
    }

    public void setOkna(Okno okno) {
        this.okna.add(okno);
    }
}
