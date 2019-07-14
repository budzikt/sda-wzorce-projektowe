package proxy.zadanie;

import java.util.List;

public class Proxy implements BarIfc {

    private Bar prawdziwyBar;

    private List<String> listaUzytkownikow;
    private char security;

    public Proxy(Bar bar) {
        this.prawdziwyBar = bar;
    }

    public void ustawDozwolonaLiera(char c) {
        this.security = c;
    }


    @Override
    public boolean wypijPiwo(String imie) {
        this.prawdziwyBar.wypijPiwo(imie);
        return true;
    }
}
