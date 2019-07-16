package it;

import java.util.function.Supplier;

public class It {

    static int val = 0;

    public static void main(String[] args) {

        Supplier<Integer> s1 = getSup();
        Supplier<Integer> s2 = getSup();

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s2.get());
        System.out.println(s2.get());

    }

    static Supplier<Integer> getSup() {
        return new Supplier<Integer>() {
            private int val = 0;
            @Override
            public Integer get() {
                return val++;
            }
        };
    }
}
