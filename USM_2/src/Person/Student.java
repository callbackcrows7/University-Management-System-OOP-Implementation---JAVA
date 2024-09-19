package Person;
import java.util.List;

import Contact.Contact;
import University.Account;
import University.Department;
import University.Exam;

public class Student extends UniversityPerson{
    private String studentId;
    private Guardian guardian;
    private List<Exam> exam;
    private double fee;

    public Student(String personId, String name, int age, String blood, Contact contact, Department department, Account account, String studentId, Guardian guardian, List<Exam> exam, double fee) {
        super(personId, name, age, blood, contact, department, account);
        this.studentId = studentId;
        this.guardian = guardian;
        this.exam = exam;
        this.fee = fee;
    }

    public String getStudentId() {return studentId;}
    public void setGuardian(Guardian guardian) {this.guardian = guardian;}
    public Guardian getGuardian() {return guardian;}
    public void setExam(List<Exam> exam) {this.exam = exam;}
    public List<Exam> getExam() {return exam;}
    public double getFee() {return fee;}
    public void setFee(double fee) {this.fee = fee;}

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "studentId='" + studentId + '\'' +
                ", guardian=" + guardian +
                ", exam=" + exam +
                ", fee=" + fee +
                '}';
    }
}