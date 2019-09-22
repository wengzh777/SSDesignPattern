package DecoratorPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 1:25
 */
public class Sugar extends CondimentDecorator {

    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ",sugar";
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double cost() {
        return beverage.cost() + .2;
    }

}
