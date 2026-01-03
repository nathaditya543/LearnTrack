package entities;

public class Trainer extends Person {
    String[] courses;
    int id;

    public Trainer(String[] courses, int id, String firstName, String  lastName, String email){
        super(firstName, lastName, email);
        this.courses = courses;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String[] getCourses() {
        return courses;
    }

    @Override
    public String getName() {
        return "Trainer: " + super.getName();
    }
}
