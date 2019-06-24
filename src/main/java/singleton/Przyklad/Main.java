package singleton.Przyklad;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancja();
        Singleton s2 = Singleton.getInstancja();
        Singleton s3 = Singleton.getInstancja();
    }
}
