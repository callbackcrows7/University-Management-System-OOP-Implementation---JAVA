package Person;

import Contact.Contact;
import University.Account;
import University.Department;

public class Stuff extends Employee{
    private String title;

    public Stuff(String personId, String name, int age, String blood, Contact contact, Department department, Account account, String employeeId, double salary, String title) {
        super(personId, name, age, blood, contact, department, account, employeeId, salary);
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Stuff{" + "title='" + title + '\'' + ", " + super.toString() + '}';
    }
}
