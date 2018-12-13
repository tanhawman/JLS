package jls;

/**
 *
 * @author Sushi
 */
public class Product {
   private String name;
   private String desc;
   private int in_stock;
   private double price;

    public Product(String name, String desc, int in_stock, double price) {
        this.name = name;
        this.desc = desc;
        this.in_stock = in_stock;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getIn_stock() {
        return in_stock;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setIn_stock(int in_stock) {
        this.in_stock = in_stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}
