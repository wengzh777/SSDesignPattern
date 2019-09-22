package DecoratorPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 1:12
 */
public abstract class Beverage {
    protected String description = "Uknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
