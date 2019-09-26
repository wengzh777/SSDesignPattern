package StatePattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/26 7:52
 */
public class SugarMachine {

    private State noCoinState = new NoCoinState(this);
    private State hadCoinState = new HadCoinState(this);
    private State soldState = new SoldState(this);
    private State soldOutState = new SoldOutState(this);

    private State nowState;
    private int count;

    public SugarMachine(int count) {
       if(count > 0 ) {
           this.count = count;
           nowState = noCoinState;
       }else{
           nowState = soldOutState;
       }
    }

    void setNowState(State nowState) {
        this.nowState = nowState;
    }

    int getCount() {
        return count;
    }

    State getNoCoinState() {
        return noCoinState;
    }

    State getHadCoinState() {
        return hadCoinState;
    }

    State getSoldState() {
        return soldState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    boolean sold(int count){
        if(count > 0 && count <= this.count){
            this.count -= count;
            return true;
        }
        return false;
    }

    public void insertCoin(){
        nowState.insertCoin();
    }

    public void rejectCoin(){
        nowState.rejectCoin();
    }

    public void turnHandle(){
        nowState.turnHandle();
        nowState.dispense();
    }

    public void refill(int count){
        if(count > 0) {
            if(this.count == 0){
                nowState = noCoinState;
            }
            this.count+=count;
            System.out.println("machine is being filled....finish! ");
        }
    }

}
