package adapter.przyklad.pakiet.innej.firmy;

public class AdaptowanaKlasa {


    public AdaptowanaKlasa() {
    }

    public String dodajGwiazdki(String tekst, int num) {

        String gwiazki = "";
        for(int i = 0; i<num; i++) {
            gwiazki = gwiazki.concat("*");
        }
        return gwiazki + tekst  +  gwiazki;
    }
}
