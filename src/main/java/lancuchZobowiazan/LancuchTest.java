package lancuchZobowiazan;

public class LancuchTest {
    public static void main(String[] args) {

        Handler h = new Handler50();
        h.ustawNastepny(new Handler70())
                .ustawNastepny(new Handler90());

        Handler h50 = new Handler50();
        Handler h70 = new Handler70();
        Handler h90 = new Handler90();

        h50.ustawNastepny(h90);
        h70.ustawNastepny(h90);



        System.out.println(h.obsluz(40));
        System.out.println(h.obsluz(60));
        System.out.println(h.obsluz(230));

        System.out.println(h50.obsluz(40));
        System.out.println(h50.obsluz(60));
        System.out.println(h50.obsluz(230));
    }
}
