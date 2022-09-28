package Entity.builders;

import Entity.User;

public abstract class UserBuilder <T extends UserBuilder<?>>{
    protected Integer ID;
    protected String firstName;
    protected String lastName;
    protected String phoneNbr;
    protected String email;
    protected String password_hash;

    public T ID(int ID){
        this.ID=ID;
        return (T)this;
    }
    public T firstName(String firstName){
        this.firstName=firstName;
        return (T)this;
    }
    public T lastname(String lastname){
        this.lastName=lastname;
        return (T)this;
    }
    public T phonenbr(String phoneNbr){
        this.phoneNbr=phoneNbr;
        return (T)this;
    }
    public T email(String email){
        this.email=email;
        return (T)this;
    }
    public T password_hash(String password_hash){
        this.password_hash=password_hash;
        return (T)this;
    }
}
