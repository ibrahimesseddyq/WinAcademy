package Entity.builders;

import Entity.Student;
import Entity.Teacher;

import java.util.Calendar;

public class StudentBuilder extends UserBuilder<StudentBuilder> {
    private Calendar startDate;
    public StudentBuilder startdate(Calendar sd){
        this.startDate = sd;
        return this;
    }
    public Student build(){
        return new Student(super.ID,super.firstName,super.lastName,super.phoneNbr,super.email,super.password_hash,this.startDate);
    }

}
