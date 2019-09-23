package AdapterPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:08
 */
public class TurkeyAdapter  implements DuckBehavior{

    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack(){
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){ //由于火鸡飞行时间很短，要多飞几下假装成鸭子
            turkey.fly();
        }
    }
}
