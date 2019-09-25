package IteratorPattern;

import java.util.Iterator;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/25 22:13
 */
public class TestMain {
    public static void main(String[] args) {
        EasternMenu easternMenu = new EasternMenu();
        Iterator easternMenuIterator = easternMenu.crteateIterator();
        while(easternMenuIterator.hasNext()){
            MenuItem menuItem = (MenuItem) easternMenuIterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
