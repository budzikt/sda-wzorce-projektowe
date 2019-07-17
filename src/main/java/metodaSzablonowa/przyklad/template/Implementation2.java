package metodaSzablonowa.przyklad.template;

public class Implementation2 extends AbstractTemplate {
    @Override
    public void part1() {
        System.out.println("Czesc 1 z klasy Implementation2");
    }

    @Override
    public void part3() {
        System.out.println("Czesc 3 z klasy Implementation2");
    }

    @Override
    public void part2() {
        System.out.println("Czesc 2 z klasy Implementation2 - NADPISANA");
    }
}
