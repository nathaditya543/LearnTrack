package entities;
import entities.Student;
import java.util.*;

public class Course{
    private int id, duration;
    private String CourseName, desc;
    private boolean active;
    private ArrayList<Student> studList = new ArrayList<>();


    public Course(int id, int duration, String CourseName, String desc){
        this.id = id;
        this.duration = duration;
        this.CourseName = CourseName;
        this.desc = desc;
        active = true;
    }

    public Course(int id, int duration, String CourseName, String desc, boolean active){
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

    public void addStudent(Student student){
        studList.add(student);
    }

    public ArrayList<Student> getStudents(){
        return studList;
    }
}