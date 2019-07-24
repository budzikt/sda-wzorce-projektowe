package singleton.zadanie;

public class Test {
    public static void main(String[] args) throws Exception {
        SingletonPi ps = SingletonPi.getInstance();
        System.out.println(ps.getPiValue());

    }
}
