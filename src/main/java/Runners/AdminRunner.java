package Runners;

import Auth.Auth;
import Database.Database;
import Entity.Departement;
import Service.AdminService;
import Service.StudentService;

import java.util.Scanner;

public class AdminRunner {
    Auth auth;
    AdminService adminService;
    Database db;

    public void chooseAdminABSMenu(){
        System.out.println("choisir entre ces options :");
        System.out.println("1 => voir les infos personnels d'un etudiant ");
        System.out.println("2 => voir la moyen general d'un etudiant  ");
        System.out.println("3 => Ajouter un departement  ");
        System.out.println("4 => Ajouter un enseignant  ");
        System.out.println("5 => voir la liste des departements ");
        System.out.println("6 => Sortir du programme   ");


    }
    public void addDepartementConsole(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer l'ID de departement");
        int id = sc.nextInt();
        System.out.println("Entrer le nom de departement");
        String dk = sc.nextLine();
        String name = sc.nextLine();

        Departement dep = new Departement(id,name);
        this.adminService.addDepartement(dep);
        System.out.println("departement added");

    }
    public void showStudentInfo(int id){
        System.out.println(this.adminService.GetStudentInfos(id));
    }
    public AdminRunner(Auth auth, Database db){
        this.auth= auth;
        this.adminService = new AdminService(db);
        this.db = db;
    }
}
