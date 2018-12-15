package jls;

import java.lang.reflect.Array;
import java.util.Date;

public class Order {
    private String order_ID;
    private String[] item_name;
    private int[] quantity;
    private String address;
    private String priority;
    private String del_date;
    private String status;
    private int distance;
    private String pickup_date;
    private String pickup_time;
    private boolean isPaid;
    private int total_bill;
    private String cust_name;
    
    public Order(String order_ID, String[] item_name, int[] quantity, String address, String priority, String del_date, String status, int distance, String pickup_date, String pickup_time, boolean isPaid, int total_bill, String cust_name) {
        this.order_ID = order_ID;
        this.item_name = item_name;
        this.quantity = quantity;
        this.address = address;
        this.priority = priority;
        this.del_date = del_date;
        this.status = status;
        this.distance = distance;
        this.pickup_date = pickup_date;
        this.pickup_time = pickup_time;
        this.isPaid = isPaid;
        this.total_bill = total_bill;
        this.cust_name = cust_name;
    }
    
    public Order() {
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String[] getItem_name() {
        return item_name;
    }

    public void setItem_name(String[] item_name) {
        this.item_name = item_name;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDel_date() {
        return del_date;
    }

    public void setDel_date(String del_date) {
        this.del_date = del_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(String pickup_date) {
        this.pickup_date = pickup_date;
    }

    public String getPickup_time() {
        return pickup_time;
    }

    public void setPickup_time(String pickup_time) {
        this.pickup_time = pickup_time;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public int getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(int total_bill) {
        this.total_bill = total_bill;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }


}
