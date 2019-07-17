package lancuchZobowiazan.przyklad;

import lancuchZobowiazan.przyklad.lancuch.Handler;
import lancuchZobowiazan.przyklad.lancuch.HandlerDodawanie;
import lancuchZobowiazan.przyklad.lancuch.HandlerMnozenie;

public class Test {

    public static void main(String[] args) {
        Handler h1 = new HandlerDodawanie(5);
        Handler h2 = new HandlerDodawanie(h1,2);
        Handler h3 = new HandlerDodawanie(h2,6);

        System.out.println(h3.dzialanie(1));


        Handler h4 = new HandlerMnozenie(2);
        h4.setNext(new HandlerMnozenie(2)).setNext(new HandlerDodawanie(3));

        System.out.println(h4.dzialanie(2));

    }
}
