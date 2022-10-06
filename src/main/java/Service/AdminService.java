package Service;

import Database.Database;
import Entity.Departement;
import Repository.AdminRepository;
import Repository.StudentRepository;

import java.util.ArrayList;

public class AdminService {
    AdminRepository admrepo;
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



}
