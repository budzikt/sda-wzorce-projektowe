package pylek.przyklad;

public abstract class Pylek {
    private int id;
    private static final int rozmiarDanych = 100;
    /* Udajemy, że to waży 5GiB */
    private int[] dane;

    Pylek(int mnoznik, int id) {
        dane = new int[Pylek.rozmiarDanych];
        for(int i = 0; i<Pylek.rozmiarDanych; i++) {
            dane[i] = mnoznik  * i;
        }
        this.id = id;
    }

    public int getDaneByIdx(int idx) {
        return this.dane[idx];
    }
}
