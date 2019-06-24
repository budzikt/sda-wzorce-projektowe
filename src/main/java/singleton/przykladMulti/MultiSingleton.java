package singleton.przykladMulti;

import java.util.HashMap;
import java.util.Map;

public class MultiSingleton {

    private int id;
    private static final int maxInstances = 3;

    private static Map<Integer, MultiSingleton> instanceList = new HashMap<>();

    private MultiSingleton(int id) {
        this.id = id;
        MultiSingleton.instanceList.put(id, this);
    }

    public static MultiSingleton getInstance(int id) throws Exception {
        if(MultiSingleton.instanceList.containsKey(id)) {
            System.out.println("Instancja singletona o id" + id + " juz istnieje, zwracam istniejaca");
            return MultiSingleton.instanceList.get(id);
        } else {
            if(MultiSingleton.instanceList.size() < MultiSingleton.maxInstances) {
                System.out.println("Instancja singletona o id" + id + " NIE istnieje, tworze");
                MultiSingleton ms = new MultiSingleton(id);
                MultiSingleton.instanceList.put(id, ms);
                return ms;
            } else {
                throw new Exception("Maksymalna lista singletonów utworzona");
            }
        }
    }

}
