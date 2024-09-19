package University;

import java.util.List;
import Person.Teacher;

public class Department {
    private String departmentId, departmentName;
    private List<Subject> subjects;
    private Teacher dean;
    private List<Teacher> teachers;

    public Department(String departmentId, String departmentName, List<Subject> subjects, Teacher dean, List<Teacher> teachers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.subjects = subjects;
        this.dean = dean;
        this.teachers = teachers;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    public List<Subject> getSubjects() {
        return subjects;
    }
    public void setDean(Teacher dean) {
        this.dean = dean;
    }
    public Teacher getDean() {
        return dean;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", subjects=" + subjects +
                ", dean=" + dean +
                ", teachers=" + teachers +
                '}';
    }

}
