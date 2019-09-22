package FactoryPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 23:10
 */
public class testMain {
    public static void main(String[] args) {
        MexicoPizzaStore mexicoPizzaStore = new MexicoPizzaStore();
        Pizza mexicoPizza =  mexicoPizzaStore.orderPizza("");
        mexicoPizza.introduce();

    }
}
