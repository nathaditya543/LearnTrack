package entities;

public class Person {
    String firstName, lastName, email;

    public Person(String firstName, String lastName, String email){
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
