package fabrykaAbstrakcyjna.zadanie;

public class FabrykaKamienna extends Fabryka {
    @Override
    public Sciana getSciana() {
        return new ScianaKamienna();
    }
}
