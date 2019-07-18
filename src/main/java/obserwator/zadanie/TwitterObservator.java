package obserwator.zadanie;

public class TwitterObservator extends Obserwator {

    public void powiadom(String wiadomosc) {
        System.out.println( "Twitter mówi:" + wiadomosc );
    }
}
