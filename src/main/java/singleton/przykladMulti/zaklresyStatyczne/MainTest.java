package singleton.przykladMulti.zaklresyStatyczne;

public class MainTest {
    public static void main(String[] args) {
        StaticScope scope = new StaticScope();
        
        scope.metodaInstancji();
        scope.metodaStatyczna();

        //StaticScope.metodaInstancji();
        StaticScope.metodaStatyczna();

    }
}
