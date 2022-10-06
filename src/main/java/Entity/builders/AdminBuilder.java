package Entity.builders;

import Entity.Admin;
import Entity.Student;

import java.util.ArrayList;

public class AdminBuilder extends UserBuilder<AdminBuilder>{
    public Admin build(){
        this.roles=new ArrayList<>();
        return new Admin(super.ID,super.firstName,super.lastName,super.phoneNbr,super.email,super.password_hash);
    }
}
