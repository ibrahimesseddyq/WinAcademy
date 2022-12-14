package Auth;

import Database.Database;
import Entity.Admin;
import Entity.Student;
import Repository.AdminRepository;
import Repository.StudentRepository;

import java.util.Scanner;

public class Auth {
    private String email;
    private String password;
    private AuthRoles role;

    public  Boolean Authenticate(Database db){
        AuthCred authCred = this.authInput();
        System.out.println(authCred);
        this.GetCred(authCred);
        Boolean exists = this.checkCred(db);
        System.out.println(exists);

        if(exists == true){
            return true;
        }
        else{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Il y'a aucun compte avec cet email ou mot de passe");
            System.out.println("----------------------------------------------------");
            Authenticate(db);
        }
        return false;


    }
    public static AuthCred authInput(){
        System.out.println("Authentication: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle role ");
        System.out.print("(le role mis par defaut est STUDENT)   : ");
        String role = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        AuthRoles authrole = AuthRoles.STUDENT;
        switch (role){
            case "STUDENT":
            case "student":
            case "Student":
                authrole = AuthRoles.STUDENT;
                break;

            case "Teacher":
            case "TEACHER":
            case "teacher":
                authrole = AuthRoles.TEACHER;
                break;
            case "SCHOOL ADMIN":
            case "school admin":
            case "School Admin":
                authrole = AuthRoles.REG_ADMIN;
                break;
            case "Admin":
            case "ADMIN":
            case "admin":
                authrole = AuthRoles.ABS_ADMIN;
                break;



        }
        return new AuthCred(email,password,authrole);

    }
    public void GetCred(AuthCred auth){
        this.email = auth.getEmail();
        this.password = auth.getPassword();
        this.role  = auth.getRole();

    }
    public Boolean checkCred(Database db){
        System.out.println(this.role);
        if(this.role == AuthRoles.STUDENT){
            StudentRepository strep = new StudentRepository();
            Student student = strep.StudentByEmail(db,email);
            System.out.println(student);
            if(student.getPassword_hash().equals(password)){
                System.out.println("You are logged in");
                return true;
            }
            else
            {
                return false;
            }
        } else if (this.role == AuthRoles.ABS_ADMIN) {
            AdminRepository admrep = new AdminRepository();
            Admin admin = admrep.getAdminInfos(db);
            if(admin.getPassword_hash().equals(password)){
                System.out.println("You are logged in");
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;

    }
//    public Student SearchAccountsStudents(Database database,String schoolName){
//
//    }

    public String getEmail() {
        return email;
    }

    public AuthRoles getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
