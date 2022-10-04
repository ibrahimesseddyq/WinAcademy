package Service;

import Database.Database;
import Entity.Student;
import Repository.StudentRepository;

public class StudentService {
    StudentRepository stdrepo;
    Database db ;
    public StudentService(Database db){
        this.stdrepo = new StudentRepository();
    }
    public void GetYourInfos(String email){

        Student you = this.stdrepo.StudentByEmail(db,email);
        System.out.println(you);
    }

}
