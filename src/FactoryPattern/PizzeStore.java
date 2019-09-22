package FactoryPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 16:27
 */
public abstract class PizzeStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizze(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizze(String type);
}
