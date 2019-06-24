package memento;

public class Memento {
    private UstawieniaPokoju up;

    public Memento(UstawieniaPokoju up){
        this.up = up;
    }

    public UstawieniaPokoju odzyskaj() {
        return this.up;
    }
}
