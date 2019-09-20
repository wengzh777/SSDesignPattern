package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class CanNotFly implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("我不会飞。");
    }
}
