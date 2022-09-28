package Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ExamGrade {
    private Integer ID;
    private Float examGrade;
    private ArrayList<Subject> subjects;
    private Calendar examDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Float getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(Float examGrade) {
        this.examGrade = examGrade;
    }

    public Calendar getExamDate() {
        return examDate;
    }

    public void setExamDate(Calendar examDate) {
        this.examDate = examDate;
    }
}
