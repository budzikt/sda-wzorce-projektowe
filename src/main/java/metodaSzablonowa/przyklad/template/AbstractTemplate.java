package metodaSzablonowa.przyklad.template;

public abstract class AbstractTemplate {

    public final void doTheJob() {
        this.part1();
        this.part2();
        this.part3();

    }

    protected abstract void part1();

    protected void part2() {
        System.out.println("Czesc 2 zadania z klasy abstrakcyjnej");
    }

    protected abstract void part3();

}
