package Person;

import Contact.Contact;

public class Guardian extends Person{
    private String profession;
    private double income;

    public Guardian(String personId, String name, int age, String blood, Contact contact, String profession, double income) {
        super(personId, name, age, blood, contact);
        this.profession = profession;
        this.income = income;
    }

    public String getProfession() {return profession;}
    public void setProfession(String profession) {this.profession = profession;}
    public double getIncome() {return income;}
    public void setIncome(double income) {this.income = income;}

    @Override
    public String toString() {
        return super.toString() + "Guardian{" +
                "profession='" + profession + '\'' +
                ", income=" + income +
                '}';
    }
}
