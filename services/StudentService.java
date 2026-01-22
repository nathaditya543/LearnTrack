package services;

import entities.Student;
import exceptions.EntityNotFoundException;

import java.util.*;

public class StudentService{
    
    public ArrayList<Student> StudentList = new ArrayList<>();

    public void addStudent(Student newStud){
        StudentList.add(newStud);
    }

    public Student getStudent(int id){
        for(Student i: StudentList){
            if(i.getId() == id)
                return i;
        }

        throw new EntityNotFoundException("Student not found with ID: " + id);
    }

    public void ToggleStudent(int id){
        for(Student i: StudentList){
            if(i.getId() == id){
                i.setActive(!i.getStatus());
                return;
            }
        }

        throw new EntityNotFoundException("Student not found with ID: " + id);
    }

}