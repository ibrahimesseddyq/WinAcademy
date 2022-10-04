import Auth.Auth;
import Auth.AuthCred;
import Auth.AuthRoles;
import Database.Database;
import Service.StudentService;

import java.util.Scanner;

public class Runner {
    StudentService studentService;
    Database db;
    Auth auth;
    public Runner( Database db){
        auth = new Auth();
        this.db = db;
        studentService = new StudentService(db);
    }

    public  void run(){
        welcome();
        auth.Authenticate(db);



    }
    public static void welcome(){
        System.out.println("Welcome To WinAcademy");

    }

//    public


}
