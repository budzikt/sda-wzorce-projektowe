package Iterator.przyklad;

public class Kolekcja {

    private Element[] elements;

    public Kolekcja(Element[] elements) {
        this.elements = elements;
    }

    public Iterator getIterator() {
        return new ElementIterator(this);
    }

    public Element getElementAt(int idx) {
        return elements[idx];
    }

    public int getElementsCount() {
        return  this.elements.length;
    }

}
