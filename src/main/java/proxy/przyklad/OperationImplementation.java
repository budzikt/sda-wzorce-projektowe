package proxy.przyklad;

public class OperationImplementation extends SystemInterface {

    @Override
    public void WykonajAkcje(String user) {
        System.out.println("Witamu uzytkownika " + user);
    }
}
