package Entity;

import java.util.ArrayList;

public class Class {
    private Integer ID;
    private String name;
    public ArrayList<Student> students;

    public Class(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
