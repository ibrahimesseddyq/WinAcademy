package Service;

import Database.Database;
import Entity.Departement;
import Entity.Student;
import Repository.AdminRepository;
import Repository.StudentRepository;
import util.Date;

import java.util.ArrayList;

public class AdminService {
    AdminRepository admrepo;
    StudentRepository stdrepo;

    Database db ;

    public AdminService(Database db){
        this.admrepo = new AdminRepository();
        this.db=db;
    }
    public void getDepartements(){
        ArrayList<Departement> deps =  this.admrepo.showDepartements(this.db);
        deps.forEach(departement -> {
            System.out.println("ID : " +departement.getID());
            System.out.println("Name : "+departement.getName());
        });
    }
    public void addDepartement(Departement dep){
        this.admrepo.addDepartement(db,dep);
    }
    public String GetStudentInfos(int id){
        Student student = this.stdrepo.StudentByID(this.db,id);
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



}
