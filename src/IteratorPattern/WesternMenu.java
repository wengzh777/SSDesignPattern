package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/25 21:48
 */
public class WesternMenu {
    List<MenuItem> items;

    public WesternMenu() {
        this.items = new ArrayList<>();
        addItem("战斧牛排",59.9,false);
        addItem("清水西兰花",26.9,true);
    }

    private void addItem(String name,double price,boolean isVegetarian){
        items.add(new MenuItem(name,price,isVegetarian));
    }
}
