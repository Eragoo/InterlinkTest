package institution;

import person.Student;

public class University {

    private String universityName;
    private static ArrayList<Student> studentsList;

    public University(String name) {
        universityName = name;
    }

    private void setStudent(Student student) {
        studentsList = new ArrayList<Students>();
        int level = (int) (Math.random() * 10 + 1);
        student.setKnowledge(new Knowledge(level));
    }

    public void addStudent(Student student) {
        setStudent(student);
        studentsList.add(student);
    }

    public ArrayList<Studend> getStudentsList() {
        return studentsList;
    }
}
