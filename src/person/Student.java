package person;

import person.consciousness.Knowledge;

public class Student {

    private String studentName;
    private Knowledge studentKnowledge;

    public Student(String name) {
        studentName = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        studentKnowledge = knowledge;
    }

    public String getStudentName() {
        return studentName;
    }

}
