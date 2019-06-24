package singleton.Przyklad;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstancja();
        s = Singleton.getInstancja();
        s = Singleton.getInstancja();
    }
}
