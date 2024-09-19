package Person;
import Contact.Contact;

public class Person {
    private String personId, name, blood;
    private int age;
    private Contact contact;

    public Person(String personId, String name, int age, String blood, Contact contact) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.contact = contact;
    }

    public String getPersonId() {return personId;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getBlood() {return blood;}
    public void setBlood(String blood) {this.blood = blood;}
    public Contact getContact() {return contact;}
    public void setContact(Contact contact) {this.contact = contact;}

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", blood='" + blood + '\'' +
                ", contact=" + contact +
                '}';
    }
}
