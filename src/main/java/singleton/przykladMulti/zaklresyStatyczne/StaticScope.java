package singleton.przykladMulti.zaklresyStatyczne;

public class StaticScope {
    public static int statucznyInt = 5;
    public int instancyjnyInt = 1;

    public static void metodaStatyczna() {
        System.out.println(statucznyInt);
        System.out.println(StaticScope.statucznyInt);

        // System.out.println(this.instancyjnyInt);
        // System.out.println(instancyjnyInt);
    }

    public void metodaInstancji() {

        System.out.println(statucznyInt);
        System.out.println(StaticScope.statucznyInt);

        System.out.println(this.instancyjnyInt);
        System.out.println(instancyjnyInt);
    }

    public static void main(String[] args) {
        StaticScope test = new StaticScope();
        StaticScope.metodaStatyczna();
        test.metodaInstancji();
    }

}
