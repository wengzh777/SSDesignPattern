package TemplateMethod;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:47
 */
public class Coffee extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Deipping Coffee through filter");
    }

    @Override
    void addConiments() {
        System.out.println("adding suger and milk");
    }
}
