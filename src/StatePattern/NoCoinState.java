package StatePattern;

import sun.java2d.Surface;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 23:06
 */
public class NoCoinState extends State {
    private SugarMachine sugarMachine;

    public NoCoinState(SugarMachine sugarMachine) {
        this.sugarMachine = sugarMachine;
    }

    public void insertCoin(){
        sugarMachine.setNowState(sugarMachine.getHadCoinState());
        System.out.println("you insert one coin");
    }
}
