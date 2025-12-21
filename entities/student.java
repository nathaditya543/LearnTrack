package entities;

public class student extends person {
    boolean active;
    int id;

    //Constructor overloading - when admin wants to define an active user they can do so with a single parameter only
    public student(int id,  String firstName, String lastName, String  email){
        super(firstName, lastName, email);
        this.id = id;
        active = true;
    }


    //Constructor overloading  - incase admin wants to define an inactive student
    public  student(int id, boolean active, String firstName, String lastName, String  email){
        super(firstName, lastName, email);
        this.id = id;
        this.active = active;
    }


    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return active;
    }

    @Override
    public String getName(){
        return "Student: " + super.getName();
    }

}
