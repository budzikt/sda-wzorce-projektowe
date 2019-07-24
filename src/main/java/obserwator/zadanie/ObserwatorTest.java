package obserwator.zadanie;

public class ObserwatorTest {
    public static void main(String[] args) {

        Temat t = new TematHordoTeleHering();
        TwitterObservator tObs = new TwitterObservator();

        t.dodajObserwatore(tObs);

        t.zdarzenie("Na Boga, nowy koncert hordó tele hering w listopadzie");
        // t.zdarzenie("Na Boga, nowy koncert hordó tele hering w listopadzie");
        // t.zdarzenie("Na Boga, nowy koncert hordó tele hering w listopadzie");
        // t.zdarzenie("Na Boga, nowy koncert hordó tele hering w listopadzie");

    }
}
