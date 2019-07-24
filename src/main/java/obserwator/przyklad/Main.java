package obserwator.przyklad;

public class Main {

    public static void main(String[] args) {
        Subject s = new SubjectImpl();

        Observer o1 = new ObserverPlus1();
        Observer o2 = new ObserverX2();

        s.addObserver(o1);
        s.addObserver(o2);

        s.notifyAllObservers(5);
        s.notifyAllObservers(6);
        s.notifyAllObservers(10);
        s.notifyAllObservers(2);
        s.notifyAllObservers(1000);
    }
}
