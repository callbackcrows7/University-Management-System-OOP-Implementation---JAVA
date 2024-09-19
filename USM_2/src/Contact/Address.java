package Contact;

public class Address {
    private String contactId, roadNo, city, state, country, postalCode;

    // Constructors to initialize the address object
    public Address(String contactId, String roadNo, String city, String state, String country, String postalCode) {
        this.contactId = contactId;
        this.roadNo = roadNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Setter and getter for the address object
    public String getContactId() {return contactId;}
    public void setRoanNo(String roadNo) {this.roadNo = roadNo;}
    public String getRoanNo() {return this.roadNo;}
    public void setCity(String city) {this.city = city;}
    public String getCity() {return this.city;}
    public void setState(String state) {this.state = state;}
    public String getState() {return this.state;}
    public void setCountry(String country) {this.country = country;}
    public String getCountry(String country) {return this.country;}
    public void setPostalCode(String postalCode) {this.postalCode = postalCode;}
    public String getPostalCode() {return this.postalCode;}

    @Override public String toString() {
        return "Address{" +
                "contactId='" + contactId + '\'' +
                ", roadNo='" + roadNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

}
