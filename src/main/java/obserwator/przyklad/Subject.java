package obserwator.przyklad;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    public void notifyAllObservers(int valToEmit) {
        for(Observer obs: this.observers) {
            obs.update(valToEmit);
        }
    }




}
