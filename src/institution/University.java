package institution;

import person.Student;
import person.consciousness.Knowledge;
import java.util.*;

public class University {

    private String universityName;
    private static ArrayList<Student> studentsList = new ArrayList<Student>();

    public University(String name) {

        universityName = name;
    }

    private void setStudent(Student student) {
        int level = (int) (10);
        student.setKnowledge(new Knowledge(level));
    }

    public void addStudent(Student student) {
        setStudent(student);
        studentsList.add(student);
    }

    public ArrayList<Student> getStudentsList() {

        return studentsList;
    }
}
