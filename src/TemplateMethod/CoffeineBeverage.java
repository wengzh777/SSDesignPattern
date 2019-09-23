package TemplateMethod;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:43
 */
public abstract class CoffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        addConiments();
        pourIntoCup();
    }

    void boilWater(){
        System.out.println("boiling water");
    }

    abstract void brew();

    abstract void addConiments();

    void pourIntoCup(){
        System.out.println("pouring into cup");
    }
}
