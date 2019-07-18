package lancuchZobowiazan.zadanie;

public class Handler50 extends Handler {


    public String obsluz(int predkosc) {
        if(predkosc < 50) {
            return "Uwaga zwolnij ";
        } else {
            if(this.nastepny != null) {
                return nastepny.obsluz(predkosc);
            } else {
                return ":(";
            }
        }
    }
}
