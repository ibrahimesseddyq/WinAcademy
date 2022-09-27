package Entity;

import java.util.ArrayList;

public class Departement {
    private int ID;
    private String name;
    private ArrayList<Teacher> teachers;
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
