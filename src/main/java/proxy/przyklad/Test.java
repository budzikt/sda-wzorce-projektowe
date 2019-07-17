package proxy.przyklad;

import proxy.zadanie.Proxy;

public class Test {
    public static void main(String[] args) {
        BazaDanych db = new BazaDanych(500);
        ProxyBazyDanych proxy = new ProxyBazyDanych(db);

        int tries = 3;

        while(tries != 0) {
            System.out.println(proxy.pobierzLiczbeUzytkownikow());
            if(!proxy.usunWszystko()) {
                tries--;
            } else {
                break;
            }
        }

    }
}
