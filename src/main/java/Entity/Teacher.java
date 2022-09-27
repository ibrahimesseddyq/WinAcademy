package Entity;

import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User {
    private Date startWorkDate;
    private String subject;
    private ArrayList<Class> classes;

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
