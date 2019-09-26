package StatePattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 8:02
 */
public class HadCoinState extends State {
    private SugarMachine sugarMachine;

    public HadCoinState(SugarMachine sugarMachine) {
        this.sugarMachine = sugarMachine;
    }

    public void turnHandle(){
       sugarMachine.setNowState(sugarMachine.getSoldState());
        System.out.println("you is truning handle");
    }

    public void rejectCoin(){
        sugarMachine.setNowState(sugarMachine.getNoCoinState());
        System.out.println("you was rejected one coin");
    }
}
