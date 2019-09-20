package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class LowFly implements FlyInterface{
    @Override
    public void fly() {
        System.out.println("低空飞行。");
    }
}
