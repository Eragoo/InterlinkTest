package institution.interlink;

import java.util.*;
import person.Student;
import institution.University;

public class Internship {

    private String internshipName;
    private ArrayList<Student> arr;

    public Internship(String name) {
        internshipName = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public String getStudents() {
        University uni = new University("helper");
        arr = uni.getStudentsList();
        String tmp = "";
        for (Student st : arr) {
            tmp += st.getStudentName() + "\n";
        }
        return tmp;
    }
}
