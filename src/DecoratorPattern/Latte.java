package DecoratorPattern;


/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 1:20
 */
public class Latte extends Beverage {

    public Latte(String description) {this.description = description; };

    public String getDescription(){
        return this.description;
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
