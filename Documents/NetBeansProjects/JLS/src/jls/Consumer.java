package jls;

public abstract class Consumer {
    private String name;
    private String gender;
    private String type;
    private String ic;
    private String address;
    private String contact;

    public Consumer() {
    }
    
    public Consumer(String name, String gender, String type, String ic, String address, String contact) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.ic = ic;
        this.address = address;
        this.contact = contact;
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

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getContact() {
        return contact;
    }
}
