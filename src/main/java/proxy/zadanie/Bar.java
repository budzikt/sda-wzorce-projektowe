package proxy.zadanie;

public abstract class Bar implements BarIfc{

    private int iloscPiw;

    public Bar(int piwa) {
        this.iloscPiw = piwa;
    }

    @Override
    public boolean wypijPiwo(String imie) {
        if(--this.iloscPiw == 0) {
            System.out.println("Zabrakło piwa dla: " + imie);
            return false;
        } else {
            System.out.println(imie + " pije sobie piwo");
            return true;
        }
    }
}
