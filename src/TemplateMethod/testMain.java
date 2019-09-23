package TemplateMethod;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/23 23:49
 */
public class testMain {
    public static void main(String[] args) {
        CoffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        CoffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
