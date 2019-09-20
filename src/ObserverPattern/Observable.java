package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wzh
 * @description: ObserverPattern
 * @date:2019/9/20
 */
public abstract class Observable {

    private Set<Observer> observers = new HashSet<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){

    }

}
