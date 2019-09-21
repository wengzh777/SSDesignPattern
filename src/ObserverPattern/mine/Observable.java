package ObserverPattern.mine;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wzh
 * @description: ObserverPattern
 * @date:2019/9/20
 */
public abstract class Observable {

    private final Set<Observer> observers = new HashSet<>();
    private static boolean change = false;

    public final void registerObserver(Observer observer){
        observers.add(observer);
    }

    public final void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObservers();

    public void change(){
       this.change = true;
    }

    public boolean isChange(){
        return change;
    }


}
