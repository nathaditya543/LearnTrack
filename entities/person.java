package entities;

public class Person {
    private String firstName, lastName, email;
    private int id;

    public Person(String firstName, String lastName, String email, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getId(){
        return id;
    }
}
