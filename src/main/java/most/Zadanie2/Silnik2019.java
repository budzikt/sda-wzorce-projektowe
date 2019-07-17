package most.Zadanie2;

public class Silnik2019 extends Silnik {


    public Silnik2019(int cylindry, int pojemnosc) {
        super(cylindry, pojemnosc);
    }

    @Override
    public int dodajGazu() {
        System.out.println("Wrooom..." + (this.obecneObroty += 300));
        return this.obecneObroty;
    }
}
