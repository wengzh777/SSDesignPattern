package ObserverPattern.JDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 0:42
 */
public class WeatherObserver implements Observer {
    private WeatherSubject weatherSubject;


    public WeatherObserver(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("today weather is " + arg);
    }
}
