package lancuchZobowiazan;

public class Handler70 extends Handler {
    public String obsluz(int predkosc) {
        if(predkosc < 70) {
            return "UWAGA ZWOLNIJ";
        } else {
            return this.nastepny.obsluz(predkosc);
        }
    }
}
