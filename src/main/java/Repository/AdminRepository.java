package Repository;

import Database.Database;
import Entity.Admin;
import Entity.Departement;

import java.util.ArrayList;

public class AdminRepository {
    public void addDepartement(Database db, Departement departement){
        db.getDb().get(0).addDepartement(departement);

    }
    public ArrayList<Departement> showDepartements(Database db){
        ArrayList<Departement> deps= db.getDb().get(0).departements;
        return deps;
    }
    public Admin getAdminInfos(Database db){
        return db.getDb().get(0).getAdmin();
    }


}
