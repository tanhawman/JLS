package jls;

public class OrderItem {
    private Product pname;
    private int quantity;

    public OrderItem(Product pname, int quantity) {
        this.pname = pname;
        this.quantity = quantity;
    }

    public Product getPname() {
        return pname;
    }

    public void setPname(Product pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
