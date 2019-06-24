package proxy.przyklad;

import java.util.ArrayList;
import java.util.List;

public class Proxy extends SystemInterface {

    private SystemInterface realOperation;

    private List<String> listaUzytkownikow;

    public Proxy(SystemInterface operation) {
        this.listaUzytkownikow = new ArrayList<>();
        listaUzytkownikow.add("Adam");
        listaUzytkownikow.add("Janusz");
        listaUzytkownikow.add("Grażyna");

        this.realOperation = operation;
    }

    @Override
    public void WykonajAkcje(String user) {
        if(listaUzytkownikow.contains(user)) {
            realOperation.WykonajAkcje(user);
        } else {
            System.out.println("Przykro mi " + user + " ale nie ma cie na liście");
        }
    }
}
