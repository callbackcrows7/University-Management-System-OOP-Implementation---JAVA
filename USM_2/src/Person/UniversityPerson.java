package Person;

import Contact.Contact;
import University.Account;
import University.Department;

public class UniversityPerson extends Person{
    private Department department;
    private Account account;

    public UniversityPerson(String personId, String name, int age, String blood, Contact contact, Department department, Account account) {
        super(personId, name, age, blood, contact);
        this.department = department;
        this.account = account;
    }

    public void setDepartment(Department department) {this.department = department;}
    public Department getDepartment() {return department;}
    public void setAccount(Account account) {this.account = account;}
    public Account getAccount() {return account;}

    @Override
    public String toString() {
        return super.toString() + "UniversityPerson{" +
                "department=" + department +
                ", account=" + account +
                "}";
    }
}
