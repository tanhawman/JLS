
/**
 *
 * @author Sushi
 */
public class Customer {
    private String name;
    private String gender;
    private String type;
    private String ic;
    private String address;
    private String contract;
    private String status;
    private double remaincredit;
    private double credit_limit;

    public Customer() {
    }
    public Customer(String name, String gender, String type, String ic, String address, String contract, String status, double remaincredit, double credit_limit) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.ic = ic;
        this.address = address;
        this.contract = contract;
        this.status = status;
        this.remaincredit = remaincredit;
        this.credit_limit = credit_limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemaincredit(double remaincredit) {
        this.remaincredit = remaincredit;
    }

    public void setCredit_limit(double credit_limit) {
        this.credit_limit = credit_limit;
    }
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public String getContract() {
        return contract;
    }

    public String getStatus() {
        return status;
    }

    public double getRemaincredit() {
        return remaincredit;
    }

    public double getCredit_limit() {
        return credit_limit;
    }
    
    
}
