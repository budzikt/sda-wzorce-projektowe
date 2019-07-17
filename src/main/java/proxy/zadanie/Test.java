package proxy.zadanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Bar bar = new BarImpl(50);
        Proxy barProxy = new Proxy(bar);
        barProxy.ustawDozwolonaLiera('R');

        List<String> wchodzacy = new ArrayList<String>(Arrays.asList("Jan", "Robert", "Zdzisław"));

        for(String name: wchodzacy) {
            if(!barProxy.wypijPiwo(name)) {
                System.out.println(name + ": Tobie nie wolno wejść!");
            }
        }

    }
}
