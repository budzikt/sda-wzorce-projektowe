package proxy.przyklad;

public class Test {
    public static void main(String[] args) {

        SystemInterface operation = new OperationImplementation();
        SystemInterface proxy = new Proxy(operation);

        proxy.WykonajAkcje("Grażyna");
        proxy.WykonajAkcje("Nieznany uzytkownik systemu");
    }
}
