package jls;

public class Arrangement {
    private String a_ID;
    private String a_style;
    private String a_size;
    private String a_flower;
    private String a_accessory;
    private String a_priority;
    private int a_TotalPrice;
    private String aBil;

    public Arrangement(String a_ID, String a_style, String a_size, String a_flower, String a_accessory, String a_priority, int a_TotalPrice) {
        this.a_ID = a_ID;
        this.a_style = a_style;
        this.a_size = a_size;
        this.a_flower = a_flower;
        this.a_accessory = a_accessory;
        this.a_priority = a_priority;
        this.a_TotalPrice = a_TotalPrice;
        this.aBil = aBil;
    }
    
    public Arrangement() {
    }

    public String getA_ID() {
        return a_ID;
    }

    public void setA_ID(String a_ID) {
        this.a_ID = a_ID;
    }

    public String getA_style() {
        return a_style;
    }

    public void setA_style(String a_style) {
        this.a_style = a_style;
    }

    public String getA_size() {
        return a_size;
    }

    public void setA_size(String a_size) {
        this.a_size = a_size;
    }

    public String getA_flower() {
        return a_flower;
    }

    public void setA_flower(String a_flower) {
        this.a_flower = a_flower;
    }

    public String getA_accessory() {
        return a_accessory;
    }

    public void setA_accessory(String a_accessory) {
        this.a_accessory = a_accessory;
    }

    public String getA_priority() {
        return a_priority;
    }

    public void setA_priority(String a_priority) {
        this.a_priority = a_priority;
    }

    public int getA_TotalPrice() {
        return a_TotalPrice;
    }

    public void setA_TotalPrice(int a_TotalPrice) {
        this.a_TotalPrice = a_TotalPrice;
    }

  
}
