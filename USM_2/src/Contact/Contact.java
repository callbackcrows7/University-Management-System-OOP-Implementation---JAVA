package Contact;

public class Contact {
    private String contactId, email, phone, altPhone;
    private Address address;

    // Constructors to initialize the contact object
    public Contact(String contactId, String email, String phone, String altPhone, Address address) {
        this.contactId = contactId;
        this.email = email;
        this.phone = phone;
        this.altPhone = altPhone;
        this.address = address;
    }

    // Setter and getter for the contact object
    public String getContactId() { return contactId; }
    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getPhone() { return phone; }
    public void setAltPhone(String altPhone) { this.altPhone = altPhone; }
    public String getAltPhone() { return altPhone; }
    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", altPhone='" + altPhone + '\'' +
                ", address=" + address +
                '}';
    
    }
}
