package services;

import java.util.*;
import entities.*;
import exceptions.EntityNotFoundException;

public class EnrollementService {
    public ArrayList<Enrollment> enrollmentList = new ArrayList<>();

    public void addEnrollment(Enrollment newEnroll){
        enrollmentList.add(newEnroll);
    }

    public Enrollment getEnrollment(int id){
        for(Enrollment i : enrollmentList){
            if(i.getId() == id)
                return i;
        }

        throw new EntityNotFoundException("Enrollment with id " + id + " not found");
    }

    public void PushEnrollment(Enrollment enr){
        if(enr.getStatus() != "ACTIVE"){
            System.out.println("# Enrollment is not ACTIVE");
            System.out.println("Current status is: " + enr.getStatus());
            return ;
        }

        Student stud = enr.getStudent();
        Course course = enr.getCourse();
        stud.addCourse(course);
        course.addStudent(stud);

        enr.setStatus("COMPLETED");
        System.out.println("# Enrollment pushed succesfully");
    }

    public void CancelEnrollment(Enrollment enr){
        enr.setStatus("CANCELLED");
    }

    public void setStatus(int i, Enrollment enr){
        if(i == 1){
            enr.setStatus("ACTIVE");
        }
        else if(i == 0){
            enr.setStatus("CANCELLED");
        }
        else{
            System.out.println("# Wrong input chosen");
        }
    }

}
