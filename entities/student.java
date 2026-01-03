package entities;

public class Student extends Person {
    private boolean active;

    //Constructor overloading - when admin wants to define an active user they can do so with a single parameter only
    public Student(int id,  String firstName, String lastName, String  email){
        super(firstName, lastName, email, id);
        active = true;
    }


    //Constructor overloading  - incase admin wants to define an inactive student
    public Student(int id, boolean active, String firstName, String lastName, String  email){
        super(firstName, lastName, email, id);
        this.active = active;
    }


    public boolean getStatus() {
        return active;
    }

    @Override
    public String getName(){
        return "Student: " + super.getName();
    }

    public void setActive(boolean active){
        this.active = active;
    }

}
