package adapter.przyklad;

public class Test {

    public static void main(String[] args) {
        AdaptowanaKlasa ak = new AdaptowanaKlasa(0.15);
        AdapterSystemu adapter = new AdapterSystemu(ak);
        System.out.println(adapter.wyliczWartosc(40));
    }
}
