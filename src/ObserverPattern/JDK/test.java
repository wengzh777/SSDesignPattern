package ObserverPattern.JDK;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 0:57
 */
public class test {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        WeatherObserver weatherObserver = new WeatherObserver(weatherSubject);

        weatherSubject.mesureWeather("good");
    }
}
