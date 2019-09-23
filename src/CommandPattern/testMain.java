package CommandPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 22:59
 */
public class testMain {

    public static void main(String[] args) {
        PivotSystem pivotSystem = new PivotSystem(8);
        Light light = new Light();
        Commend lightOn = new LinghtOnCommand(light);
        pivotSystem.setCommend(lightOn,1);
        pivotSystem.pressButton(1);
        pivotSystem.undo();
    }
}
