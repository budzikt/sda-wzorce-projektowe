package mediator.zadanie;

import mediator.zadanie.elementKolejowy.ElementKolejowy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MediatorKolejowy {

    private Map<Integer, Boolean> stanElementow;

    public MediatorKolejowy() {
        this.stanElementow = new HashMap<>();
    }

    public void mediuj(ElementKolejowy element) {
        if(this.stanElementow.containsKey(element.getId())) {
            this.stanElementow.replace(element.getId(), element.isMoznaJechac());
        } else {
            this.stanElementow.put(element.getId(), element.isMoznaJechac());
        }
    }

    public boolean getWynikMediacji() {
        Set<Boolean> values = new HashSet<>(this.stanElementow.values());
        return (values.size() == 1 && values.contains(true));
    }


}
