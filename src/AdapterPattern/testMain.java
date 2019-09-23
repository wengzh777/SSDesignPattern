package AdapterPattern;

import StrategyPattern.Duck;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:16
 */
public class testMain {
    public static void main(String[] args) {
        Turkey americanTurkey = new AmericanTurkey();
        DuckBehavior turkeyAdapter = new TurkeyAdapter(americanTurkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
