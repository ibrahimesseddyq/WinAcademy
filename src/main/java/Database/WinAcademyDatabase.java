package Database;

import Entity.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class WinAcademyDatabase implements Database {
    private ArrayList<School> db;

    public WinAcademyDatabase() {
        this.db = new ArrayList<>();
    }

    @Override
    public void InitializeDb(Object object , Method method)  {
        try{
            this.db.add((School) method.invoke(object,method));

        }catch (Exception e){
            System.out.println("Exception :");
            DBInitialization dbinit= new DBInitialization();
            this.db.add(dbinit.initializeClassesStudentsAndAbove());
        }
    }

    public ArrayList<School> getDb() {
        return db;
    }

    public void setDb(ArrayList<School> db) {
        this.db = db;
    }
    //    public Integer getStudentByDepartement(Integer ID ){
//        this.schools.stream().map(school -> {
//           school.departements.stream().map(departement -> {
//               if(departement.getID() == ID){
//                   ArrayList<Teacher> teachers = new ArrayList<Teacher>();
//                   departement.teachers.stream().map(teacher -> teacher.classes.stream().map(classe->classe.students.stream().map(student->student).collect(Collectors.toList())));
//               }
//           }) ;
//        });
//
//    }
//    public Integer getSchoolIDByName(String name){
////        this.schools.stream().filter(school -> )
//    }


}
