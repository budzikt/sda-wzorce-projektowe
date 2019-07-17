package Iterator.przyklad;

public class ElementIterator extends Iterator {

    public ElementIterator(Kolekcja kolekcja) {
        super(kolekcja);
    }

    @Override
    public boolean maNastepny() {
        return this.obecnyIdx < this.ostatniIdx - 1;
    }

    @Override
    public Element pobiezElement() {
        return this.kolekcja.getElementAt(this.obecnyIdx);
    }

    @Override
    public boolean czyKoniec() {
        return this.obecnyIdx == this.ostatniIdx - 1;
    }

    @Override
    public void nastepny() {
        this.obecnyIdx++;
    }
}
