package services;

import entities.Course;
import exceptions.EntityNotFoundException;

import java.util.*;

public class CourseService {

    public ArrayList<Course> courseList = new ArrayList<>();
    
    public void addCourse(Course newCourse){
        courseList.add(newCourse);
    }

    public Course getCourse(int id){
        for(Course i: courseList){
            if(i.getId() == id)
                return i;
        }

        throw new EntityNotFoundException("Course with Course ID " + id + " not found.");
    }
    
    public void toggleCourse(int id){
        for(Course i: courseList){
            if(i.getId() == id){
                i.setActive(!i.getStatus());
                return;
            }
        }
        
        throw new EntityNotFoundException("Course with Course ID " + id + " not found.");
    }

}
