import Person.*;
import University.*;
import Contact.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityManagementApp {
    public static void main(String[] args) {
        // Create sample data
        Address address = new Address("1", "123", "City", "Region", "Country", "12345");
        Contact contact = new Contact("1", "email@example.com", "1234567890", "0987654321", address);

        Subject subject = new Subject("1", "Mathematics", 3.0);
        Department department = new Department("1", "Science", new ArrayList<>(), null, new ArrayList<>());

        Account account = new Account("1", "Savings", 1000.0, new java.util.Date());

        // Create a teacher
        Teacher teacher = new Teacher("01", "Dr. John", 40, "AB-", contact, department, account, "506", 1000000, subject);
        TeacherService teacherService = new TeacherService();
        teacherService.addTeacher(teacher);

        // Create a student
        Guardian guardian = new Guardian("1", "John Alex", 30, "A+", contact, "Doctor", 500000);
        Student student = new Student("1", "Justin benefits", 20, "A+", contact, department, account, "250k", guardian, new ArrayList<>(), 10000);
        StudentService studentService = new StudentService();
        studentService.addStudent(student);

        // Output student details
        List<Student> allStudents = studentService.getAllStudents();
        for (Student s : allStudents) {
            System.out.println("Student: " + s.getName() + ", Department: " + s.getDepartment().getDepartmentName());
        }

        // Output teacher details
        List<Teacher> allTeachers = teacherService.getAllTeachers();
        for (Teacher t : allTeachers) {
            System.out.println("Teacher: " + t.getName() + ", Subject: " + t.getSubject().getSubjectName());
        }

        System.out.println(student.toString());
    }
}
