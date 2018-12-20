package jls;



public class Arrangement implements Comparable<Arrangement>{
    private String a_ID;
    private String a_style;
    private String a_size;
    private String a_flower;
    private String a_accessory;
    private int a_priority;
    private int a_TotalPrice;
    private String aBil;
    private String a_date;
    private String a_status;

    public Arrangement(String a_ID, String a_style, String a_size, String a_flower, String a_accessory, int a_priority, int a_TotalPrice, String a_date, String a_status) {
        this.a_ID = a_ID;
        this.a_style = a_style;
        this.a_size = a_size;
        this.a_flower = a_flower;
        this.a_accessory = a_accessory;
        this.a_priority = a_priority;
        this.a_TotalPrice = a_TotalPrice;
        this.aBil = aBil;
        this.a_date = a_date;
        this.a_status=a_status;
    }

    public String getA_status() {
        return a_status;
    }

    public void setA_status(String a_status) {
        this.a_status = a_status;
    }

    

    public void setaBil(String aBil) {
        this.aBil = aBil;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    public String getaBil() {
        return aBil;
    }

    public String getA_date() {
        return a_date;
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

    public int getA_priority() {
        return a_priority;
    }

    public void setA_priority(int a_priority) {
        this.a_priority = a_priority;
    }

    public int getA_TotalPrice() {
        return a_TotalPrice;
    }

    public void setA_TotalPrice(int a_TotalPrice) {
        this.a_TotalPrice = a_TotalPrice;
    }


    @Override
    public int compareTo(Arrangement o) {
         return Integer.compare(this.getA_priority(),o.getA_priority());
    }
  
}
