package StatePattern;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 7:59
 */
public class SoldState extends State{
    private SugarMachine sugarMachine;

    public SoldState(SugarMachine sugarMachine) {
        this.sugarMachine = sugarMachine;
    }

    public void dispense(){
        sugarMachine.sold(1);
        if(sugarMachine.getCount() > 0){
            sugarMachine.setNowState(sugarMachine.getNoCoinState());
            System.out.println("you get a sugar");
        }else{
            sugarMachine.setNowState(sugarMachine.getSoldOutState());
        }
    }
}
