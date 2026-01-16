package com.example.validate_form;

// importing annotations to set constraints for the user form variables
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

// this class contains the fields to be filled in by the user as their attributes
public class UserForm {

    // the NotNull annotation prevents the variable from being null (Spring MVC generates a null entry if the field is empty)
    @NotNull
    // the Size annotation places a limit on the length of a string (i.e. 2 - 30 characters)
    @Size(min=2, max=30)
    private String name;

    @NotNull
    // the Min annotation requires an integer to have a minimum value (i.e. more than 100)
    @Min(100)
    private Integer id;

    // getter and setter methods for the name and id attributes
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    // this function returns a string version of the class when called
    public String toString() {
        return "User(Name: " + this.name + ", ID: " + this.id + ")";
    }
}
