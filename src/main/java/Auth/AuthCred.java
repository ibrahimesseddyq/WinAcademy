package Auth;

public class AuthCred {
    private  String email;
    private  String password;
    private  AuthRoles role;

    public  AuthCred(String email, String password, AuthRoles role) {
        this.email = email;
        this.password = password;
        this.role =role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public AuthRoles getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "AuthCred{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
