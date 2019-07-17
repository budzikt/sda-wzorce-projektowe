package most.Zadanie1;

public class KwadratCzerwony extends KsztaltCzerowny {
    public KwadratCzerwony(float wysokosc, float szerokosc) {
        super(wysokosc, szerokosc);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem czerownym kwadratem");
    }
}
