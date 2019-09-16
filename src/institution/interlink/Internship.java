package institution.interlink;

import java.util.*;
import person.Student;
import institution.University;

public class Internship {

    private String internshipName;
    private ArrayList<Student> students;

    public Internship(String name) {
        internshipName = name;
    }

    public String getStudents() {
        University uni = new University("helper");
        students = uni.getStudentsList();
        return filterStudents(students);
    }

    private String filterStudents(ArrayList<Student> arrList) {
        students = arrList;
        String tmp = "";
        int summOfMark = 0;
        int mark = 0;

        for (Student student : students) {
            summOfMark += student.getKnowledge();
        }
        int normalMark = summOfMark/students.size();

        for (Student student : students) {
            mark = student.getKnowledge();
            if (mark > normalMark) {
                tmp += student.getStudentName() + "\n";
            }
        }
        if (tmp == ""){
            return "Empty :(";
        }
        return tmp;
    }
}
