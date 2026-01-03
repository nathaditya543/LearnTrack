package entities;

public class Trainer extends Person {
    private String[] courses;

    public Trainer(String[] courses, int id, String firstName, String  lastName, String email){
        super(firstName, lastName, email, id);
        this.courses = courses;
    }


    public String[] getCourses() {
        return courses;
    }

    @Override
    public String getName() {
        return "Trainer: " + super.getName();
    }
}
