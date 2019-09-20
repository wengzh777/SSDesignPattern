package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public abstract class Duck {

    private FlyInterface flyBehavior;
    private QuackInterface quackBehavior;

    public Duck(FlyInterface flyBehavior,QuackInterface quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public final void fly(){
        flyBehavior.fly();
    }

    public final void quack(){
        quackBehavior.quack();
    }
}
