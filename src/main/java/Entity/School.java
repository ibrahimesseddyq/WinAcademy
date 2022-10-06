package Entity;

import java.util.ArrayList;

public class School {
    private int ID;
    private String name;
    private String siteUrl;
    private Admin admin;
    public ArrayList<Departement> departements;

    public ArrayList<Departement> getDepartements() {
        return departements;
    }



    public School(int ID, String name, String siteUrl) {
        this.ID = ID;
        this.name = name;
        this.siteUrl = siteUrl;
        this.departements = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
    @Override
    public String toString() {
        return "School{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", departements=" + departements +
                '}';
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public void addDepartement(Departement departement){
        this.departements.add(departement);
    }

}
