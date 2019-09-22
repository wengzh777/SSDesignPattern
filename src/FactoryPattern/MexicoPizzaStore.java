package FactoryPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 16:30
 */
public class MexicoPizzaStore extends PizzeStore {


    @Override
    public Pizza createPizze(String type) {
        return new MexicoPizza();
    }
}
