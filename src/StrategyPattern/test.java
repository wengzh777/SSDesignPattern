package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class test {
    public static void main(String[] args) {

        Duck smallYellowDuck = new SmallYellowDuck(new LowFly(),new GaGaQuack());
        Duck machineDuck = new MachineDuck(new CanNotFly(),new GuaGuaQuack());

        smallYellowDuck.fly();
        smallYellowDuck.quack();

        machineDuck.fly();
        machineDuck.quack();
    }


}
