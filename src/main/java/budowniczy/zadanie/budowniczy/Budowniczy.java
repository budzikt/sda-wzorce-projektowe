package budowniczy.zadanie.budowniczy;

import budowniczy.zadanie.DaneOsobowe;

public abstract class Budowniczy {
    protected DaneOsobowe prototyp;

    Budowniczy() {
        this.prototyp = new DaneOsobowe();
    }

    public Budowniczy setName(String name) {
        prototyp.setName(name);
        return this;
    }

    public Budowniczy setSurname(String surname) {
        prototyp.setSurname(surname);
        return this;
    }

    public Budowniczy setNIP(Long NIP) {
        prototyp.setNIP(NIP);
        return this;
    }

    public Budowniczy setREGON(String REGON) {
        prototyp.setREGON(REGON);
        return this;
    }

    public Budowniczy setPESEL(Long PESEL) {
        prototyp.setPESEL(PESEL);
        return this;
    }

    public Budowniczy setVatPayer(Boolean vatPayer) {
        prototyp.setVatPayer(vatPayer);
        return this;
    }

    public Budowniczy setNick(String nick) {
        prototyp.setNick(nick);
        return this;
    }

    public Budowniczy dodajDaneOgolne(String imie, String nazwisko, Long pesel) {
        return this.setName(imie)
                .setSurname(nazwisko)
                .setPESEL(pesel);
    }

    public Budowniczy dodajDaneBiznesowe(String regon, Long nip) {
        return this.setREGON(regon)
                .setNIP(nip);
    }

    public Budowniczy dodajDaneOsobowe(String przezwisko) {
        return this.setNick(przezwisko);
    }


    public abstract boolean czyDaneOsoboweKompletne();
    public DaneOsobowe pobierzDaneOsobowe() {
        return this.prototyp;
    }
}
