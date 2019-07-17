package most.przyklad;

public class LepszaAbstrakcja extends Abstrakcja {

    public LepszaAbstrakcja(Implementacja impl) {
        super(impl);
    }

    @Override
    protected String przedstawKlase() {
        return "Jestem klasa LepszaAbstrakcja i";
    }

}
