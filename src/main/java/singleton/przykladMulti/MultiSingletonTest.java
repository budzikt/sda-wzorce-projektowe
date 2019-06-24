package singleton.przykladMulti;

public class MultiSingletonTest {

    public static void main(String[] args) {
        try {
            MultiSingleton ms1 = MultiSingleton.getInstance(1);
            MultiSingleton ms2 = MultiSingleton.getInstance(1);
            MultiSingleton ms3 = MultiSingleton.getInstance(2);
            MultiSingleton ms4 = MultiSingleton.getInstance(3);
            MultiSingleton ms5 = MultiSingleton.getInstance(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
