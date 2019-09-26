package StatePattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 23:08
 */
public class SoldOutState extends State {
    private SugarMachine sugarMachine;

    public SoldOutState(SugarMachine sugarMachine) {
        this.sugarMachine = sugarMachine;
    }

    public void insertCoin(){
        System.out.println("sugar was sold out");
    }
}
