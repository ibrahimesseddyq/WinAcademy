package Repository;

import Database.Database;
import Entity.Class;
import Entity.Student;

import java.util.ArrayList;

public class StudentRepository {
    public ArrayList<Student> getStudentsBySchool(int school_id, Database db){
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<db.getDb().size();i++){
            if(db.getDb().get(i).getID() == school_id) {
                for (int j = 0; j < db.getDb().get(i).departements.size(); j++) {
                    for (int l = 0; l < db.getDb().get(i).departements.get(j).getTeachers().size(); l++) {
                        for (int k = 0; k < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().size(); k++) {
                            for (int m = 0; m < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.size(); m++) {
                                students.add(db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.get(m));
                            }
                        }
                    }
                }
            }
        }
        return  students;
    }
    public ArrayList<Student> getAllStudents(Database db){
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<db.getDb().size();i++){
                for (int j = 0; j < db.getDb().get(i).departements.size(); j++) {
                    for (int l = 0; l < db.getDb().get(i).departements.get(j).getTeachers().size(); l++) {
                        for (int k = 0; k < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().size(); k++) {
                            for (int m = 0; m < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.size(); m++) {
                                students.add(db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.get(m));
                            }
                        }
                    }
                }
            }
        return  students;
    }
    public Student StudentByName(Database db,String name){
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<db.getDb().size();i++){
            for (int j = 0; j < db.getDb().get(i).departements.size(); j++) {
                for (int l = 0; l < db.getDb().get(i).departements.get(j).getTeachers().size(); l++) {
                    for (int k = 0; k < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().size(); k++) {
                        for (int m = 0; m < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.size(); m++) {
                            Student student  = db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.get(m);
                            if(student.getFirstName().equals(name)){
                                return student;
                            }
                        }
                    }
                }
            }
        }
        return  null;
    }
    public Student StudentByEmail(Database db,String email){
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<db.getDb().size();i++){
            for (int j = 0; j < db.getDb().get(i).departements.size(); j++) {
                for (int l = 0; l < db.getDb().get(i).departements.get(j).getTeachers().size(); l++) {
                    for (int k = 0; k < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().size(); k++) {
                        for (int m = 0; m < db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.size(); m++) {
                            Student student  = db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(k).students.get(m);
                            if(student.getFirstName().equals(email)){
                                return student;
                            }
                        }
                    }
                }
            }
        }
        return  null;
    }
//    public Student addStudentToClasse(int classe_id,Student student,Database db){
//        try {
//            for(int i =0;i<db.getDb().size();i++){
//                for (int j = 0; j < db.getDb().get(i).departements.size(); j++) {
//                    for (int l = 0; l < db.getDb().get(i).departements.get(j).getTeachers().size(); l++) {
//                        db.getDb().get(i).departements.get(j).getTeachers().get(l).getClasses().get(classe_id-1).students.add(student);
//                    }
//                }
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//    public Class findClassById(int class_id){
//
//    }


}
