package adapter.zadanie;

public class Main {

    public static void main(String[] args) {
        CenyUSD adapterUSD = new CenyUSD(new CenyIkea(), 0.11F);
        System.out.println(adapterUSD.wyliczCene(1.5F));
    }
}
