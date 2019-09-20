package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class SmallYellowDuck extends Duck{

    public SmallYellowDuck(FlyInterface flyBehavior, QuackInterface quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}
