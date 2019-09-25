package IteratorPattern;

import java.awt.*;
import java.util.Iterator;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/25 21:56
 */
public class EasternMenu {
    private final MenuItem[] items;
    int length = 10;
    int location = 0;

    public EasternMenu() {
        items = new MenuItem[length];
        addItem("西红柿炒蛋",12.9,false);
        addItem("芥末秋葵",10.0,true);
    }

    public MenuItem[] getItems() {
        return items;
    }

    public Iterator crteateIterator(){
        return new EasternMenuInterator(this);
    }

    private void addItem(String name, double price, boolean isVegetarian){
        items[location++] = new MenuItem(name,price,isVegetarian);
    }
}
