package most.przyklad;

public abstract class Abstrakcja {

    private Implementacja impl;

    public Abstrakcja(Implementacja impl) {
        this.impl = impl;
    }

    public String zrobCosFajnego() {
        return this.przedstawKlase() + this.impl.wykonaj();
    }

    public void setImpl(Implementacja impl) {
        this.impl = impl;
    }

    public Implementacja getImpl() {
        return impl;
    }

    protected abstract String przedstawKlase();
}
