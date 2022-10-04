package Database;

import Auth.AuthRoles;
import Entity.*;
import Entity.Class;
import Entity.builders.StudentBuilder;
import Entity.builders.TeacherBuilder;
import util.Date;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DBInitialization {

    public School initializeSchool(){
        School youcode = new School(1,"youcode","youcode.ma");
        return youcode;
    }
    public School initializeDepartementAndAbove(){
        Departement javaDep = new Departement(1,"javaAngular");
        Departement javascriptDep  = new Departement(2,"javascript");
        School youcode = this.initializeSchool();
        youcode.departements.add(javaDep);
        youcode.departements.add(javascriptDep);
        return youcode;
    }
    public School initializeTeachersSubjectsAndAbove(){

        Subject java = new Subject(1,"java");
        Subject js = new Subject(2,"js");
        School youcode = this.initializeDepartementAndAbove();
        Teacher bouchra = new TeacherBuilder()
                .ID(1)
                .firstName("bouchra").
                lastname("marzouk")
                .email("bmarzouk@gmail.com")
                .subject(java)
                .startdate(Date.setDate(1,2,2022))
                .build();
        Teacher abdelhafid = new TeacherBuilder()
                .ID(2)
                .firstName("abdelhafid")
                .lastname("chihaja")
                .email("cabdelhafid@gmail.com")
                .subject(js)
                .startdate(Date.setDate(4,12,2020))
                .build();
        youcode.getDepartements().get(0).teachers.add(bouchra);
        youcode.getDepartements().get(1).teachers.add(abdelhafid);
    return youcode;
    }
    public  School initializeClassesStudentsAndAbove(){
        School youcode = this.initializeTeachersSubjectsAndAbove();
        Entity.Class javaAngular = new Entity.Class(1,"javaAngular");
        Entity.Class javascript= new Class(2,"javascript");
        // --------------------------- ROLE ---------------------------------
        Role student_role = new Role(1, AuthRoles.STUDENT);
        Student jamalRaouj = new StudentBuilder()
                .ID(1)
                .firstName("jamal")
                .lastname("raouj")
                .email("r.jamal@gmail.com")
                .password_hash("student1")
                .Roles(student_role)
                .startdate(Date.setDate(1,1,2022))
                .build();
        Student ibrahimess = new StudentBuilder()
                .ID(2)
                .firstName("Ibrahim")
                .lastname("Esseddyq")
                .email("r.ibrahim@gmail.com")
                .Roles(student_role)
                .password_hash("student2")
                .startdate(Date.setDate(3,1,2022))
                .build();
        Student charaf = new StudentBuilder()
                .ID(3)
                .firstName("charaf")
                .lastname("lkelb")
                .email("k.charaf@gmail.com")
                .password_hash("student3")
                .startdate(Date.setDate(4,1,2022))
                .build();
        youcode.getDepartements().get(0).getTeachers().get(0).getClasses().add(javaAngular);
        youcode.getDepartements().get(0).getTeachers().get(0).getClasses().get(0).students.add(jamalRaouj);
        youcode.getDepartements().get(0).getTeachers().get(0).getClasses().get(0).students.add(ibrahimess);
        youcode.getDepartements().get(1).getTeachers().get(0).getClasses().add(javascript);
        youcode.getDepartements().get(1).getTeachers().get(0).getClasses().get(0).students.add(charaf);
        return youcode;
    }
    public void ShowSchoolInfo(){
        System.out.println(this.initializeClassesStudentsAndAbove());
    }
//    public static void main(String[] args){
//        WinAcademyDatabase db = new WinAcademyDatabase();
//        DBInitialization dbin = new DBInitialization();
//        School sc = dbin.initializeClassesStudentsAndAbove();
//        db.getDb().add(sc);
//
//        System.out.println(students);
//    }


}
