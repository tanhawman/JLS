package jls;

import java.util.Date;

/**
 *
 * @author Sushi
 */
public class Order {
    private String orderid;
    private String cust_name;
    private String item_name;
    private int quantity;
    private String priority;
    private String deliverydate;
    private String deliverystatus;
    private Double total_bill;
    private String pickupdate;
    private String time;
    private String distance;
    private String isPaid; 


    
    public Order() {
    }

    public Order(String orderid, String cust_name, String item_name, int quantity, String priority, String deliverydate, String deliverystatus, Double total_bill, String pickupdate, String time, String distance, String isPaid) {
        this.orderid = orderid;
        this.cust_name = cust_name;
        this.item_name = item_name;
        this.quantity = quantity;
        this.priority = priority;
        this.deliverydate = deliverydate;
        this.deliverystatus = deliverystatus;
        this.total_bill = total_bill;
        this.pickupdate = pickupdate;
        this.time = time;
        this.distance = distance;
        this.isPaid = isPaid;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public Double getTotal_bill() {
        return total_bill;
    }

    public String getPickupdate() {
        return pickupdate;
    }

    public String getTime() {
        return time;
    }
    
    public String getDistance() {
        return distance;
    }
    
    public String getIsPaid() {
        return isPaid;
    }
        
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public void setTotal_bill(Double total_bill) {
        this.total_bill = total_bill;
    }

    public void setPickupdate(String pickupdate) {
        this.pickupdate = pickupdate;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void setDistance(String distance) {
        this.distance = distance;
    }
    
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }
}
