package Entity.builders;

import Entity.Subject;
import Entity.Teacher;

import java.util.Calendar;

public class TeacherBuilder extends UserBuilder<TeacherBuilder> {
    private Calendar startWorkDate;
    private Subject subject;



    public TeacherBuilder startdate(Calendar sd){
        this.startWorkDate = sd;
        return this;
    }
    public TeacherBuilder subject(Subject sj){
        this.subject = sj;
        return this;
    }
    public Teacher build(){
        return new Teacher(super.ID,super.firstName,super.lastName,super.phoneNbr,super.email,super.password_hash,this.startWorkDate,this.subject);
    }

}
