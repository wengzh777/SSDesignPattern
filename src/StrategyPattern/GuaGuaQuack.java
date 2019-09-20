package StrategyPattern;

/**
 * @author: wzh
 * @description: StrategyPattern
 * @date:2019/9/20
 */
public class GuaGuaQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("呱呱叫。");
    }
}
