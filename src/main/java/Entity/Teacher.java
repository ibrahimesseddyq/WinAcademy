package Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Teacher extends User {
    private Calendar startWorkDate;
    private Subject subject;
    public ArrayList<Class> classes;

    public Teacher(Integer ID, String firstName, String lastName, String phoneNbr, String email, String password_hash,Calendar startWorkDate, Subject subject) {
        this.ID = ID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNbr=phoneNbr;
        this.email =email ;
        this.password_hash=password_hash;
        this.startWorkDate = startWorkDate;
        this.subject = subject;
    }

    public Calendar getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Calendar startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "startWorkDate=" + startWorkDate +
                ", subject='" + subject + '\'' +
                ", classes=" + classes +
                ", ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNbr='" + phoneNbr + '\'' +
                ", email='" + email + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", roles=" + roles +
                '}';
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
