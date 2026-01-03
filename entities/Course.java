package entities;

public class Course{
    private int id, duration;
    private String CourseName, desc;
    private boolean active;


    Course(int id, int duration, String CourseName, String desc){
        this.id = id;
        this.duration = duration;
        this.CourseName = CourseName;
        this.desc = desc;
        active = true;
    }

    Course(int id, int duration, String CourseName, String desc, boolean active){
        this.id = id;
        this.duration = duration;
        this.CourseName = CourseName;
        this.desc = desc;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getDesc() {
        return desc;
    }

    public boolean getStatus() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}