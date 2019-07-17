package most.Zadanie2;

public class Silnik2018 extends Silnik {
    public Silnik2018(int cylindry, int pojemnosc) {
        super(cylindry, pojemnosc);
    }

    @Override
    public int dodajGazu() {
        System.out.println("Wrooom..." + (this.obecneObroty += 200));
        return this.obecneObroty;
    }
}
