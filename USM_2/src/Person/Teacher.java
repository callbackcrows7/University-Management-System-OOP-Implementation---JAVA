package Person;

import Contact.Contact;
import University.Account;
import University.Department;
import University.Subject;

public class Teacher extends Employee{
    private Subject subject;
    
    public Teacher(String personId, String name, int age, String blood, Contact contact, Department department, Account account, String employeeId, double salary, Subject subject) {
        super(personId, name, age, blood, contact, department, account, employeeId, salary);
        this.subject = subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + ", subject=" + subject + '}';
    }
}
