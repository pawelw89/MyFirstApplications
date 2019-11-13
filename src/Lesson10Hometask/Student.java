package Lesson10Hometask;

public class Student extends Person {

    private String faculty;
    private int GraduateYear;

    Student(String faculty, int GraduateYear) {
        super();
        this.faculty = faculty;
        this.GraduateYear = GraduateYear;
    }

    public int getGraduateYear() {
        return GraduateYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGraduateYear(int graduateYear) {
        GraduateYear = graduateYear;
    }
}

