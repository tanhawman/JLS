
/**
 *
 * @author Sushi
 */
public class Arrangement {
    private String a_style;
    private String a_size;
    private String a_flower;
    private String a_accessory;
    private String a_priority;
    private Double a_bill;

    public Arrangement() {
    }

    public Arrangement(String a_style, String a_size, String a_flower, String a_accessory, String a_priority, Double a_bill) {
        this.a_style = a_style;
        this.a_size = a_size;
        this.a_flower = a_flower;
        this.a_accessory = a_accessory;
        this.a_priority = a_priority;
        this.a_bill = a_bill;
    }

    public String getA_style() {
        return a_style;
    }

    public String getA_size() {
        return a_size;
    }

    public String getA_flower() {
        return a_flower;
    }

    public String getA_accessory() {
        return a_accessory;
    }

    public String getA_priority() {
        return a_priority;
    }

    public Double getA_bill() {
        return a_bill;
    }

    public void setA_style(String a_style) {
        this.a_style = a_style;
    }

    public void setA_size(String a_size) {
        this.a_size = a_size;
    }

    public void setA_flower(String a_flower) {
        this.a_flower = a_flower;
    }

    public void setA_accessory(String a_accessory) {
        this.a_accessory = a_accessory;
    }

    public void setA_priority(String a_priority) {
        this.a_priority = a_priority;
    }

    public void setA_bill(Double a_bill) {
        this.a_bill = a_bill;
    }
    
}
