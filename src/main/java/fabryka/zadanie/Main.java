package fabryka.zadanie;

import fabryka.zadanie.fabryka.FabrykaPojazdow;
import fabryka.zadanie.pojazd.Pojazd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean run = true;
        FabrykaPojazdow fabryka = new FabrykaPojazdow();

        while(run) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Jaki pojazd?");
            char c = keyboard.next().charAt(0);
            PojazdType typ = convertCharToPojazdType(c);
            if (typ == null) {
                System.out.println("Nieznany typ pojazdu :(");
                run = false;
            } else {
                Pojazd p = fabryka.buildPojazd("czerwony", typ);
                p.drive();
            }

        }
    }

    private static PojazdType convertCharToPojazdType(char c) {
        switch (String.valueOf(c).toLowerCase()) {
            case "r": {
                return PojazdType.ROWER;
            }
            case "s": {
                return PojazdType.SAMOCHOD;
            }
            case "m": {
                return PojazdType.MOTOR;
            }
            default: {
                return null;
            }
        }
    }
}
