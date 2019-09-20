package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class MachineDuck extends Duck {

    public MachineDuck(FlyInterface flyBehavior, QuackInterface quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}
