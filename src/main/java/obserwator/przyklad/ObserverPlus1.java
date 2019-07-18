package obserwator.przyklad;

public class ObserverPlus1 extends Observer {
    @Override
    public void update(int val) {
        System.out.println("Plus jeden: " + (val+1));
    }
}
