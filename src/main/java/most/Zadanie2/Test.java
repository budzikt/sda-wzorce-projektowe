package most.Zadanie2;

public class Test {
    public static void main(String[] args) {
        Silnik s1 = new Silnik2018(4, 1900);
        Samochod aamochod1 = new Model2018(s1);
        aamochod1.przyspiesz();
        aamochod1.przyspiesz();


    }
}
