package University;

import Person.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    // Additional methods for teacher management
}
