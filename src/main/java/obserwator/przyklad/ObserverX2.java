package obserwator.przyklad;

public class ObserverX2 extends Observer {
    @Override
    public void update(int val) {
        System.out.println("Razy dwa: " + val*2);
    }
}
