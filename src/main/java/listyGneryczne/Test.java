package listyGneryczne;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Test {

    public Map<String, Function<Integer, Boolean>> funMap;

    Test() {
        this.funMap.put("f1", this::f1);
    }

    public static void main(String[] args) {
        List<A> list1 = new ArrayList<>();
        list1.add(new B());

        List<? super A> list2 = new ArrayList<>();
        list2.add(new B());
    }



        public Boolean f1(Integer in) {
            return true;
    }
}
