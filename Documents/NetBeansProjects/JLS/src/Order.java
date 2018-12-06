import java.util.Date;

/**
 *
 * @author Sushi
 */
public class Order {
    private String orderid;
    private String[] item_name;
    private String[] quantity;
    private String priority;
    private Date deliverydate;
    private String deliverystatus;
    private Double total_bill;
    private Date pickupdate;
    private String time;
    
    public Order() {
    }

    public Order(String orderid, String[] item_name, String[] quantity, String priority, Date deliverydate, String deliverystatus, Double total_bill, Date pickupdate, String time) {
        this.orderid = orderid;
        this.item_name = item_name;
        this.quantity = quantity;
        this.priority = priority;
        this.deliverydate = deliverydate;
        this.deliverystatus = deliverystatus;
        this.total_bill = total_bill;
        this.pickupdate = pickupdate;
        this.time = time;
    }

    public String getOrderid() {
        return orderid;
    }

    public String[] getItem_name() {
        return item_name;
    }

    public String[] getQuantity() {
        return quantity;
    }

    public String getPriority() {
        return priority;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public Double getTotal_bill() {
        return total_bill;
    }

    public Date getPickupdate() {
        return pickupdate;
    }

    public String getTime() {
        return time;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public void setItem_name(String[] item_name) {
        this.item_name = item_name;
    }

    public void setQuantity(String[] quantity) {
        this.quantity = quantity;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public void setTotal_bill(Double total_bill) {
        this.total_bill = total_bill;
    }

    public void setPickupdate(Date pickupdate) {
        this.pickupdate = pickupdate;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
