package DecoratorPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 1:28
 */
public class test {

    public static void main(String[] args) {
        Latte latte = new Latte("Latte");
        Sugar sugar1 = new Sugar(latte);
        Sugar sugar2 = new Sugar(sugar1);

        System.out.println(sugar2.getDescription());
        System.out.println(sugar2.cost());
    }
}
