package Entity;

import Auth.AuthRoles;

public class Role {
    private Integer ID;
    private AuthRoles title;

    public Role(Integer ID, AuthRoles title) {

        this.ID = ID;
        this.title = title;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public AuthRoles getTitle() {
        return title;
    }

    public void setTitle(AuthRoles title) {
        this.title = title;
    }
}
