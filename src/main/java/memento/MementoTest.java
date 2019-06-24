package memento;

public class MementoTest {

    public static void main(String[] args) {
        Nadzorca nad = new Nadzorca();
        System.out.println(nad.getPokoj().toString());
        nad.ustawNowe(new UstawieniaPokoju(PODLOGA.WYLEWKA, KOLOR_SCIAN.NIEBIESKIE));
        System.out.println(nad.getPokoj().toString());
        nad.ustawNowe(new UstawieniaPokoju(PODLOGA.PARKIET, KOLOR_SCIAN.ZIELONE));
        System.out.println(nad.getPokoj().toString());
        nad.ustawNowe(new UstawieniaPokoju(PODLOGA.PANELE, KOLOR_SCIAN.CZERWONE));
        System.out.println(nad.getPokoj().toString());
        nad.przywroc();
        System.out.println(nad.getPokoj().toString());
    }
}


