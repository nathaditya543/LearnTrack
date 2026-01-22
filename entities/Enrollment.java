package entities;
import java.time.LocalDate;

import entities.Student;
import entities.Course;

public class Enrollment {

    private int id;
    Student student;
    Course course;
    private LocalDate enrollmentDate;
    
    public enum Status{
        ACTIVE,
        CANCELLED,
        COMPLETED
    }
    
    Status status;
    
    public Enrollment(int id,  Student student, Course course) {
        this.id = id;
        this.course = course;
        this.student = student;
        this.enrollmentDate = LocalDate.now();
        this.status = Status.ACTIVE;
    }

    public int getId() {
        return id;
    }
    
    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getStatus() {
        if (status == Status.ACTIVE)
            return "ACTIVE";

        if(status == Status.CANCELLED)
            return "CANCELLED";

        if(status == Status.COMPLETED)
            return "COMPLETED";
        
        return "Error";
    }

    public void setStatus(String status) {
        if (status == "ACTIVE")
            this.status = Status.ACTIVE;
        else if (status == "COMPLETED")
            this.status = Status.COMPLETED;
        else if (status == "CANCELLED")
            this.status = Status.CANCELLED;
    }
}
