package singleton.zadanie;

public class Test {
    public static void main(String[] args) throws Exception {
        PiSingleton ps = PiSingleton.getInstance();
        System.out.println(ps.getPiValue());

    }
}
