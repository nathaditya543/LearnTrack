package entities;

public class trainer extends person {
    String[] courses;
    int id;

    trainer(String[] courses, int id, String firstName, String  lastName, String email){
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
