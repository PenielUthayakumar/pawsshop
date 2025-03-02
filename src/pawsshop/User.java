package pawsshop;

import java.io.Serializable;

abstract public class User implements Serializable { //ABSTRACT CLASS

    private String name;
    private String contactNo;
    private String username;
    private String password;

    public User(String name, String contactNo, String username, String password) {
        this.name = name;
        this.contactNo = contactNo;
        this.username = username;
        this.password = password;
    }

    public User() {
    }
    
    // Methods

    public boolean login(String enteredUser, String enteredPass) {
        return username.equals(enteredUser) && password.equals(enteredPass);
    }

    // Getters
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getContatNo() {
        return this.contactNo;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
