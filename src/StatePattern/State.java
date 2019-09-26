package StatePattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 7:49
 */
public abstract class State {

    public void insertCoin(){
        System.out.println("sorry,you can not insert the coin now");
    }

    public void rejectCoin(){
        System.out.println("sorry,no coin to reject");
    }

    public void turnHandle(){
        System.out.println("sorry,you can not turn the handle now");
    }

    public void dispense(){
        System.out.println("no sugar offer");
    }

}
