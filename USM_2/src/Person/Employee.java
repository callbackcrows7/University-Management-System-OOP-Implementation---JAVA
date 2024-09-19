package Person;

import Contact.Contact;
import University.Account;
import University.Department;

public class Employee extends UniversityPerson{
    private String employeeId;
    private double salary;

    Employee(String personId, String name, int age, String blood, Contact contact, Department department, Account account, String employeeId, double salary){
        super(personId, name, age, blood, contact, department, account);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Employee ID: " + employeeId +
                ", Salary: $" + salary;
    }
}
