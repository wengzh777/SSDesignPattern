package ObserverPattern.JDK;


import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 0:43
 */
public class WeatherSubject extends Observable {


    @Override
    public synchronized void addObserver(Observer o) {
        if(o instanceof WeatherObserver){
            super.addObserver(o);
        }else{
            throw new RuntimeException("not a weather observer!");
        }
    }

    public void mesureWeather(Object arg){
        setChanged();
        notifyObservers(arg);
    }
}
