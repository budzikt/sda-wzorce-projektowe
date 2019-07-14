package fabrykaAbstrakcyjna.zadanie.element.sciana;

public class ScianaDrewniana extends Sciana {
    private String typDrewna;

    public ScianaDrewniana(float cena, float wysokosc, float dlugosc, String typDrewna) {
        super(cena, wysokosc, dlugosc);
        this.typDrewna = typDrewna;
    }
}
