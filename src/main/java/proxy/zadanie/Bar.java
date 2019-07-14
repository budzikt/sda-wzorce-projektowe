package proxy.zadanie;

public abstract class Bar implements BarIfc{

    private int iloscPiw;

    public Bar(int piwa) {
        this.iloscPiw = piwa;
    }

    @Override
    public boolean wypijPiwo(String imie) {
        if(--this.iloscPiw == 0) {
            return false;
        } else {
            return true;
        }
    }
}
