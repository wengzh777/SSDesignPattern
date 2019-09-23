package TemplateMethod;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:46
 */
public class Tea extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addConiments() {
        System.out.println("adding some milk");
    }
}
