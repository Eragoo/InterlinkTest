package institution.interlink;

import person.Student;
import institution.University;

public class Internship {

    private String internshipName;

    public Internship(String name) {
        internshipName = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public String getStudents() {
        University u = new University("lol");
        ArrayList<Student> arr = u->getStudentsList();
        String tmp = "";
        for (Student st:
             arr) {
            tmp += st.getStudentName() + "\n";
        }
        return tmp;
    }
}
