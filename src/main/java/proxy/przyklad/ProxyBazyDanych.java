package proxy.przyklad;

import java.util.Scanner;

public class ProxyBazyDanych implements OperacjaIfc {

    private BazaDanych db;

    public ProxyBazyDanych(BazaDanych db) {
        this.db = db;
    }

    @Override
    public int pobierzLiczbeUzytkownikow() {
        return this.db.pobierzLiczbeUzytkownikow();
    }

    @Override
    public boolean usunWszystko() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj Haslo do bazy");
        String pass = keyboard.next();
        if(pass.equals( "1234" )) {
            this.db.usunWszystko();
            System.out.println("Usunieto wszystko!");
            return true;
        } else {
            System.out.println("Nieautoryzowany uzytkownik");
            return false;
        }
    }
}
