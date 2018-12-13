package jls;

public class Product {
   private String name;
   private String desc;
   private String category;
   private int in_stock;
   private int price;
   private int dis_rate;

    public Product(String name, String desc, String category, int in_stock, int price, int dis_rate) {
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.in_stock = in_stock;
        this.price = price;
        this.dis_rate = dis_rate;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIn_stock() {
        return in_stock;
    }

    public void setIn_stock(int in_stock) {
        this.in_stock = in_stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDis_rate() {
        return dis_rate;
    }

    public void setDis_rate(int dis_rate) {
        this.dis_rate = dis_rate;
    }
}
