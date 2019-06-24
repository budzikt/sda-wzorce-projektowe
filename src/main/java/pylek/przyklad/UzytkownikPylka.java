package pylek.przyklad;

public class UzytkownikPylka {

    private int wymaganeId;
    private int indexDanych;


    private Pylek mojPylek;


    public UzytkownikPylka(int id, int idx) {
        this.wymaganeId = id;
        this.indexDanych = idx;
    }

    public int getIndexDanych() {
        return indexDanych;
    }

    public int getWymaganeId() {
        return wymaganeId;
    }

    public void setMojPylek(Pylek mojPylek) {
        this.mojPylek = mojPylek;
    }

    public int uzyjPylka(UzyjDanychPylka uzyjF) throws Exception {
        return uzyjF.uzyjPylka(this.mojPylek, this.indexDanych);
    }

}
