package singleton.Przyklad;

public class Singleton {

    /*TU JEST WZORZEC*/
    private static  Singleton instancja;

    /*TU JEST WZORZEC*/
    private Singleton(){
        System.out.println("Tworze singleton, to trwa bardzo dlugo");
    }

    /*TU JEST WZORZEC*/
    public static Singleton getInstancja() {
        if(instancja == null) {
            System.out.println("Tworze nowy singleton");
            instancja = new Singleton();
            return instancja;
        } else {
            System.out.println("Nic nie muszę tworzyć, instancja sinletona już istnieje");
            return instancja;
        }
    }


}
