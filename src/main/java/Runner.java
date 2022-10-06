import Auth.Auth;
import Auth.AuthCred;
import Auth.AuthRoles;
import Database.Database;
import Runners.AdminRunner;
import Runners.StudentRunner;
import Service.AdminService;
import Service.StudentService;

import java.util.Scanner;

public class Runner {
    StudentService studentService;
    AdminService adminService;
    Database db;
    Auth auth;
    StudentRunner studentRunner;
    AdminRunner adminRunner;
    public Runner( Database db){
        auth = new Auth();
        this.db = db;
        studentService = new StudentService(db);
        this.studentRunner = new StudentRunner(auth,db);
    }

    public  void run(){
        welcome();
        Boolean logged = auth.Authenticate(db);
        Scanner sc= new Scanner(System.in);

        if(auth.getRole() == AuthRoles.STUDENT){
            studentRunner.chooseStudentMenu();
            int a = sc.nextInt();
            if(a == 1){
                this.studentRunner.ShowStudentInfo();

            } else if (a==2) {
                this.studentRunner.studentAverage();

            }

        }else if(auth.getRole() == AuthRoles.ABS_ADMIN) {

            adminRunner.chooseAdminABSMenu();
            int b = sc.nextInt();
            switch (b){
                case 1:

                case 2:
                case 3:
                    this.adminRunner.addDepartementConsole();
                    System.exit(0);
                case 4:
            }

        }



    }
    public static void welcome(){
        System.out.println("Welcome To WinAcademy");

    }

//    public


}
