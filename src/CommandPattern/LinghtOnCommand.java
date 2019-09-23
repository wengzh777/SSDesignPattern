package CommandPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 23:33
 */
public class LinghtOnCommand implements Commend {

    private Light light = new Light();

    public LinghtOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
