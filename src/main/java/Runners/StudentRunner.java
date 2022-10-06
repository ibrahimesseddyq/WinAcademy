package Runners;

import Auth.Auth;
import Database.Database;
import Entity.Student;
import Repository.StudentRepository;
import Service.StudentService;

public class StudentRunner {
    Auth auth;
    StudentService studentService;
    Database db;
    public StudentRunner(Auth auth, Database db){
        this.auth= auth;
        this.studentService = new StudentService(db);
        this.db = db;
    }

    public void ShowStudentInfo(){
        String studentName = this.studentService.GetStudentFirstName(this.auth.getEmail());
        System.out.println("Hi "+studentName+" You are on The Dashboard");
        System.out.println("Here is Your Informations :");
        String studentInfo = this.studentService.GetStudentInfos(this.auth.getEmail());
        System.out.println(studentInfo);
    }
    public  void studentAverage(){
        System.out.println("Your average grade is " + this.studentService.getExamsAverageByStudent(this.auth.getEmail()));
    }
    public void chooseStudentMenu(){
        System.out.println("choisir entre ces options :");
        System.out.println("1 => voir mes infos personnels ");
        System.out.println("2 => voir la moyen de mes notes ");
    }




}
