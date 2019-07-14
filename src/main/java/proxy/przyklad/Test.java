package proxy.przyklad;

import proxy.zadanie.Proxy;

public class Test {
    public static void main(String[] args) {
        BazaDanych db = new BazaDanych(500);
        ProxyBazyDanych proxy = new ProxyBazyDanych(db);

        System.out.println(proxy.pobierzLiczbeUzytkownikow());
        proxy.usunWszystko();
    }
}
