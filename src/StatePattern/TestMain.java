package StatePattern;

import DecoratorPattern.Sugar;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 23:10
 */
public class TestMain {

    public static void main(String[] args) {
        SugarMachine sugarMachine = new SugarMachine(3);
        sugarMachine.insertCoin();
        sugarMachine.insertCoin();
        sugarMachine.turnHandle();
        sugarMachine.insertCoin();
        sugarMachine.turnHandle();
        sugarMachine.insertCoin();
        sugarMachine.turnHandle();
        sugarMachine.insertCoin();
        sugarMachine.turnHandle();
        sugarMachine.refill(1);
        sugarMachine.insertCoin();
        sugarMachine.turnHandle();
    }

}
