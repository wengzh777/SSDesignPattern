package CommandPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 23:35
 */
public class PivotSystem {
    private Commend[] commends;
    private Commend preCommand;
    private final int DEFAULT_BUTTON_NUM = 8;

    public PivotSystem(int buttonNum) {
        if(buttonNum <= 0 || buttonNum > Integer.MAX_VALUE){
            buttonNum = DEFAULT_BUTTON_NUM;
        }
        commends = new Commend[buttonNum];
    }

    public void setCommend(Commend commend,int buttonNo){
        if(commend == null){
            throw new RuntimeException("command can not be null!");
        }
        if(buttonNo <= 0){
            throw new RuntimeException("buttoNo is valid!");
        }
        commends[buttonNo-1] = commend;
    }

    public void pressButton(int buttonNo){
        if(buttonNo < 0 || buttonNo > commends.length ){
            throw  new RuntimeException("invalid button!");
        }

        Commend commend = commends[buttonNo-1];
        if(commend != null){
            commend.excute();
            preCommand = commend;
        }
    }

    public void undo(){
        if(preCommand != null){
            preCommand.undo();
        }
    }
}