package Entity;

import java.util.ArrayList;

public class Departement {
    private int ID;
    private String name;
    public ArrayList<Teacher> teachers;

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public Departement(int ID, String name) {
        this.ID = ID;
        this.name = name;
        teachers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Departement{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
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
    public Float getAverage(){
        return null;
    }
}
