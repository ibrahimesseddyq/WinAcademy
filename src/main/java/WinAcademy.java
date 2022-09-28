import Entity.*;
import Entity.Class;
import Entity.builders.StudentBuilder;
import Entity.builders.TeacherBuilder;
import util.Date;

public class WinAcademy {
    public static void main(String[] args){
        //-------------------------- School ---------------------------------
        School youcode = new School(1,"youcode","youcode.ma");
        //-------------------------- Departement ---------------------------------

        Departement javaDep = new Departement(1,"javaAngular");
        Departement javascriptDep  = new Departement(2,"javascript");
        youcode.departements.add(javaDep);
        youcode.departements.add(javascriptDep);
        //-------------------------- Subjects ---------------------------------

        Subject java = new Subject(1,"java");
        Subject js = new Subject(2,"js");
        //-------------------------- Teachers ---------------------------------

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
        javaDep.teachers.add(bouchra);
        javascriptDep.teachers.add(abdelhafid);

        //-------------------------- Classes ---------------------------------

        Class javaAngular = new Class(1,"javaAngular");
        Class javascript= new Class(2,"javascript");
//        bouchra.classes.add(javaAngular);
//        abdelhafid.classes.add(javascript);
        //-------------------------- Students ---------------------------------
        Student jamalRaouj = new StudentBuilder()
                            .ID(1)
                            .firstName("jamal")
                            .lastname("raouj")
                            .email("r.jamal@gmail.com")
                            .password_hash("student1")
                            .startdate(Date.setDate(1,1,2022))
                            .build();
        Student ibrahimess = new StudentBuilder()
                            .ID(2)
                            .firstName("Ibrahim")
                            .lastname("Esseddyq")
                            .email("r.ibrahim@gmail.com")
                            .password_hash("student2")
                            .startdate(Date.setDate(3,1,2022))
                            .build();
        Student charaf = new StudentBuilder()
                            .ID(3)
                            .firstName("charaf")
                            .lastname("marghin")
                            .email("r.charaf@gmail.com")
                            .password_hash("student3")
                            .startdate(Date.setDate(4,1,2022))
                            .build();

        System.out.println(youcode);



    }
}
