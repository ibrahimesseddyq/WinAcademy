package Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Student extends User{
    private Calendar startDate;
    private ArrayList<ExamGrade> grades;

    public Student(Integer ID, String firstName, String lastName, String phoneNbr, String email, String password_hash,Calendar startDate) {
        this.ID = ID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNbr=phoneNbr;
        this.email =email ;
        this.password_hash=password_hash;
        this.startDate = startDate;
        this.grades=new ArrayList<>();
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public ArrayList<ExamGrade> getGrades() {
        return grades;
    }
    public void addToGrades(ExamGrade grade){
        this.grades.add(grade);
    }


    @Override
    public String toString() {
        return "Student{" +
                "startDate=" + startDate +
                ", grades=" + grades +
                ", ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNbr='" + phoneNbr + '\'' +
                ", email='" + email + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", roles=" + roles +
                '}';
    }
}
