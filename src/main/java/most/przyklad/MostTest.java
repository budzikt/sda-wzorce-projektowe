package most.przyklad;

public class MostTest {
    public static void main(String[] args) {

        Implementacja implA = new ImplementacjaA();
        Implementacja implB = new ImplementacjaB();

        Abstrakcja abs1 = new LepszaAbstrakcja(implA);
        Abstrakcja abs2 = new LepszaAbstrakcja(implB);

        System.out.println(abs1.zrobCosFajnego());
        System.out.println(abs2.zrobCosFajnego());

        Implementacja temp = abs1.getImpl();
        abs1.setImpl(abs2.getImpl());
        abs2.setImpl(temp);

        System.out.println(abs1.zrobCosFajnego());
        System.out.println(abs2.zrobCosFajnego());

    }
}
