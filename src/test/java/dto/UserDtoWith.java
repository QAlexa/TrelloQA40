package dto;

import org.testng.annotations.Test;

public class UserDtoWith {
    String password;
    String email;

   // public UserDtoWith(){}

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public UserDtoWith withEmail(String email) {
        this.email = email;
       return this;
    }
    public UserDtoWith withPassword(String password) {
        this.password = password;
        return this;
    }



}
