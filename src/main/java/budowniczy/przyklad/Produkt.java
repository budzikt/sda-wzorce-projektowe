package budowniczy.przyklad;

public class Produkt {

    private static final int BezpiecznaWartosc = 44;

    private int pole1;
    private int pole2;
    private int pole3;
    private int pole4;
    private int pole5;

    public void setPoleZawsze100(int poleZawsze100) {
        this.poleZawsze100 = poleZawsze100;
    }

    private int poleZawsze100;

    public int getPole1() {
        return pole1;
    }

    public int getPole2() {
        return pole2;
    }

    public int getPole3() {
        return pole3;
    }

    public int getPole4() {
        return pole4;
    }

    public int getPole5() {
        return pole5;
    }

    public void setPole1(int pole1) {
        this.pole1 = pole1;
    }

    public void setPole2(int pole2) {
        this.pole2 = pole2;
    }

    public void setPole3(int pole3) {
        this.pole3 = pole3;
    }

    public void setPole4(int pole4) {
        this.pole4 = pole4;
    }

    public void setPole5(int pole5) {
        this.pole5 = pole5;
    }

    public Produkt() {
        pole1 = pole2 = pole3 = pole4 = pole5 = Produkt.BezpiecznaWartosc;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(pole1)
                .append(" ")
                .append(pole2)
                .append(" ")
                .append(pole3)
                .append(" ")
                .append(pole4)
                .append(" ")
                .append(pole5)
                .toString();
    }
}
