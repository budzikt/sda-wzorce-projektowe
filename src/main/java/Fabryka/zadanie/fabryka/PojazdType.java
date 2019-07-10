package fabryka.zadanie.fabryka;

public enum PojazdType {

    SAMOCHOD('S'), ROWER('R'), MOTOR('M');
    char ch;

    PojazdType(char n) {
        this.ch = n;
    }
}
