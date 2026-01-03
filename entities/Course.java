package entities;

import java.time.Duration;
import java.util.concurrent.CopyOnWriteArrayList;

public class Course{
    int id, duration;
    String CourseName, desc;
    boolean active;


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

    void getCourse(){
        System.out.println("Course Name: " + CourseName);
        System.out.println("Course ID: " + id);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Description: " + desc);
        System.out.println("Course Active?: " + active);
    }

}