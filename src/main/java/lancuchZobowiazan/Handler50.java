package lancuchZobowiazan;

public class Handler50 extends Handler {


    public String obsluz(int predkosc) {
        if(predkosc < 50) {
            return "Uwaga zwolnij ";
        } else {
            return nastepny.obsluz(predkosc);
        }
    }
}
