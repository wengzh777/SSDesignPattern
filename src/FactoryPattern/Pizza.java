package FactoryPattern;

import javax.sound.midi.Soundbank;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/22 16:04
 */
public abstract class Pizza {
    private String name;

    protected void setName(String name){
        this.name = name;
    }

    public void introduce(){
        System.out.println("I am "+ name);
    }

    public void prepare(){
        System.out.println("I am being prepared");
    }

    public void bake(){
        System.out.println("I am being baked");
    }

    public void cut(){
        System.out.println("I am being cutted");
    }

    public void box(){
        System.out.println("I an being boxxed");
    }
}
