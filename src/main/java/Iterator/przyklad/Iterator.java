package Iterator.przyklad;

public abstract class Iterator {

        protected Kolekcja kolekcja;
        protected int obecnyIdx;
        protected int ostatniIdx;

        public Iterator(Kolekcja kolekcja) {
                this.kolekcja = kolekcja;
                this.obecnyIdx  = 0;
                this.ostatniIdx = kolekcja.getElementsCount();
        }

        public abstract boolean maNastepny();
        public abstract Element pobiezElement();
        public abstract boolean czyKoniec();
        public abstract void nastepny();

}
