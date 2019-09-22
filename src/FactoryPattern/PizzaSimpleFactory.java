package FactoryPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 16:10
 */
public class PizzaSimpleFactory {

    public Pizza create(String type){
        if("ny".equals(type)){
            return new NYPizza();
        }else if("mexico".equals(type)){
            return new MexicoPizza();
        }

        return null;
    }
}
