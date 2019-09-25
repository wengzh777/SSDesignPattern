package IteratorPattern;

import java.util.Iterator;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/25 22:01
 */
public class EasternMenuInterator implements Iterator {
    private MenuItem[] easternMenuItem;
    private int length;
    private int location = 0;

    public EasternMenuInterator(EasternMenu easternMenu) {
        this.easternMenuItem = easternMenu.getItems();
        length = easternMenuItem.length;
    }

    @Override
    public boolean hasNext() {
        int tempLoaction = location;
        while(tempLoaction < length){
            if(easternMenuItem[tempLoaction] != null){
                location = tempLoaction;
                return true;
            }
            tempLoaction++;
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return easternMenuItem[location++];
        }
        return null;
    }
}
