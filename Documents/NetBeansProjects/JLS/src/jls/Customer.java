package jls;

public class Customer extends Consumer{
    private String status;
    private int remaincredit;
    private int credit_limit;
    
    public Customer(String name, String gender, String type, String ic, String address, String contact, String status, int remaincredit, int credit_limit) {
        super(name, gender, type, ic, address, contact);
        this.status = status;
        this.remaincredit = remaincredit;
        this.credit_limit = credit_limit;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemaincredit(int remaincredit) {
        this.remaincredit = remaincredit;
    }

    public void setCredit_limit(int credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getStatus() {
        return status;
    }

    public int getRemaincredit() {
        return remaincredit;
    }

    public int getCredit_limit() {
        return credit_limit;
    }
}
