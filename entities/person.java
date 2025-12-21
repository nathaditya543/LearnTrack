package entities;

public class person {
    String firstName, lastName, email;

    public person(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }
}
