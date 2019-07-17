package metodaSzablonowa.przyklad;

import metodaSzablonowa.przyklad.template.AbstractTemplate;
import metodaSzablonowa.przyklad.template.Implementation1;
import metodaSzablonowa.przyklad.template.Implementation2;

public class Test {


    public static void main(String[] args) {

        AbstractTemplate template = new Implementation1();
        template.doTheJob();

        System.out.println("\n\n");

        template = new Implementation2();
        template.doTheJob();
    }


}
