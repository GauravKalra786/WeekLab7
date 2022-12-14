
package ca.sait.lab7.models;

import java.io.Serializable;

public class user implements Serializable {
    
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    
    public user(){
        
        
    }
    
    
    public user(String email, boolean active, String firstname, String lastname , String password , Role role){
        this.active = active;
        this.email= email;
        this.firstName = firstname;
        this.lastName = lastname;
        this.password= password;
        this.role= role;
        
    
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
        
    
    
}
