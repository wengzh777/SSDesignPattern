package IteratorPattern;

/**
 * @author Wengzihao
 * @description
 * @Date 2019/9/25 21:49
 */
public class MenuItem {
    private String name;
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, double price, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}
