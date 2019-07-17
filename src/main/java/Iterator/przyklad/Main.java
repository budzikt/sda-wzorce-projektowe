package Iterator.przyklad;

public class Main {
    public static void main(String[] args) {
        Element[] aeArr = {
                new ElementImpl(5),
                new ElementImpl(4),
                new ElementImpl(3),
                new ElementImpl(2),
                new ElementImpl(1)
        };

        Kolekcja k = new Kolekcja(aeArr);
        Iterator it = k.getIterator();
        System.out.println(it.pobiezElement().getWartosc());
        if(it.maNastepny()) {
            it.nastepny();
            System.out.println(it.pobiezElement().getWartosc());
        }

        while(it.maNastepny()) {
            it.nastepny();
            System.out.println(it.pobiezElement().getWartosc());
        }
    }
}
