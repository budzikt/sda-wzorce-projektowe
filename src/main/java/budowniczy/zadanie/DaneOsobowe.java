package budowniczy.zadanie;

public class DaneOsobowe {
    private String name;
    private  String surname;
    private Long NIP;
    private String REGON;
    private Long PESEL;
    private Boolean VatPayer;
    private String nick;

    public DaneOsobowe(String name, String surname, Long NIP, String REGON, Long PESEL, Boolean vatPayer, String nick) {
        this.name = name;
        this.surname = surname;
        this.NIP = NIP;
        this.REGON = REGON;
        this.PESEL = PESEL;
        this.VatPayer = vatPayer;
        this.nick = nick;
    }

    public DaneOsobowe() {
        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getNIP() {
        return NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public Long getPESEL() {
        return PESEL;
    }

    public Boolean getVatPayer() {
        return VatPayer;
    }

    public String getNick() {
        return nick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNIP(Long NIP) {
        this.NIP = NIP;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

    public void setPESEL(Long PESEL) {
        this.PESEL = PESEL;
    }

    public void setVatPayer(Boolean vatPayer) {
        VatPayer = vatPayer;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.name)
                .append(" ")
                .append(this.surname)
                .append(" ")
                .append(this.nick)
                .append(" ")
                .append(this.NIP)
                .append(" ")
                .append(this.PESEL)
                .append(" ")
                .append(this.REGON)
                .append(" ")
                .append(this.VatPayer)
                .toString();

    }
}
