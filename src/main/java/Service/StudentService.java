package Service;

import Database.Database;
import Entity.ExamGrade;
import Entity.Student;
import Repository.StudentRepository;
import util.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentService {
    StudentRepository stdrepo;
    Database db ;

    public StudentService(Database db){
        this.stdrepo = new StudentRepository();
        this.db=db;
    }
    public void GetYourInfos(String email){

        Student you = this.stdrepo.StudentByEmail(db,email);
        System.out.println(you);
    }
    public String GetStudentFirstName(String email){
        return stdrepo.StudentByEmail(this.db,email).getFirstName();
    }
    public String GetStudentInfos(String email){
        Student student = this.stdrepo.StudentByEmail(this.db,email);
        String fname = student.getFirstName();
        String lname = student.getLastName();
        String mail = student.getEmail();
        String phone = student.getPhoneNbr();
        String date = Date.getStringFromDate(student.getStartDate());
        return "Prenom =" + fname+" \n"+
                "Nom =" + lname + " \n"+
                "Email =" + mail + " \n"+
                "Nombre de telephone ="+ phone + " \n"+
                "Date ="+date+ " \n";

    }
    public Float getExamsAverageByStudent(String email){
        ArrayList<ExamGrade> grades = this.stdrepo.getExamsByStudent(this.db,email);
        List gr =grades.stream().map(grade->grade.getExamGrade()).reduce((a, b)->a+b).stream().collect(Collectors.toList());

        System.out.println((Float) gr.get(0)/ grades.size());
        return (Float) gr.get(0) / grades.size();
    }


}
