package entities;
import java.time.LocalDate;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    
    public enum Status{
        ACTIVE,
        CANCELLED,
        COMPLETED
    }
    
    Status status;
    
    public Enrollment(int id, int studentId, int courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = LocalDate.now();
        this.status = Status.ACTIVE;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
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
