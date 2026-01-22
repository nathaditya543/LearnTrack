import java.util.*;
import entities.*;
import services.*;

public interface Main {

    public static void createCourse(Scanner sc1, CourseService CService){
        System.out.println("\n\n################# Create Course ##################");
        System.out.println("# Enter the following details");

        System.out.print("# Course Name: ");
        String courseName = sc1.nextLine();

        System.out.print("# Course Description: ");
        String desc = sc1.nextLine();

        System.out.print("# Course ID: ");
        int id = sc1.nextInt();
        sc1.nextLine();
        
        System.out.print("# Duration in weeks: ");
        int duration = sc1.nextInt();
        sc1.nextLine();

        Course course = new Course(id, duration, courseName, desc);

        CService.addCourse(course);
        System.out.println("\n\n# Course added successfully");
        System.out.println("# Returning to Main Menu");
    }


    public static void createStudent(Scanner sc1, StudentService StudService){

        System.out.println("\n\n################# Create Student #################");
        System.out.println("# Enter the following details");

        System.out.print("# First Name: ");
        String firstName = sc1.nextLine();

        System.out.print("# Last Name: ");
        String lastName = sc1.nextLine();

        System.out.print("# Email: ");
        String email = sc1.nextLine();

        System.out.print("# Student ID: ");
        int id = sc1.nextInt();
        sc1.nextLine();

        Student student = new Student(id, firstName, lastName, email);

        StudService.addStudent(student);

        System.out.println("\n\n# Student added successfully");
        System.out.println("# Returning to Main Menu");


    }
   
   
    public static void createEnrollment(Scanner sc1, EnrollementService EService, CourseService CService, StudentService SService){
        System.out.println("\n\n############### Create Enrollment ################");
        System.out.println("# Enter the following details");

        System.out.print("# Enrollment ID: ");
        int e_id = sc1.nextInt();
        sc1.nextLine();

        System.out.print("# Student ID: ");
        int s_id = sc1.nextInt();
        sc1.nextLine();
        Student student = SService.getStudent(s_id);
        

        System.out.print("# Course ID: ");
        int c_id = sc1.nextInt();
        sc1.nextLine();
        Course course = CService.getCourse(c_id);

        Enrollment enrollment = new Enrollment(e_id, student, course);
        EService.addEnrollment(enrollment);

        System.out.println("\n\n# Enrollment added successfully");
        System.out.println("# Returning to Main Menu");
    }


    public static void pushEnrollment(Scanner sc1, EnrollementService EService){
        System.out.println("\n\n################ Push Enrollment #################");
        System.out.println("# Enter the following details");


        System.out.print("# Enter enrollment id: ");
        int id = sc1.nextInt();
        sc1.nextLine();

        
        Enrollment enrollment = EService.getEnrollment(id);
        
        EService.PushEnrollment(enrollment);
    }

    public static void printStudents(StudentService SService){
         System.out.println("\n\n################# Student List ###################");

        for(Student student: SService.StudentList){
            System.out.println(student.getName());
            System.out.println("# ID: " + student.getId());
            System.out.println("# Email: " + student.getEmail());

            System.out.println("# Courses: ");
            for(Course course: student.courseList){
                System.out.println("#\t" + course.getCourseName());
            }

            System.out.println();
            
        }
    }
    public static void  main(String[] args){
        StudentService SService = new StudentService();
        CourseService CService = new CourseService();
        EnrollementService EService = new EnrollementService();


        System.out.println("\nWelcome to LearnTrack Management System");
        int exit = 1;
        int choice = 0;
        Scanner sc1 = new Scanner(System.in);

        while(exit == 1){
            System.out.println("\n\n###################### MENU ######################");
            System.out.println("#  Enter 1 to add Student");
            System.out.println("#  Enter 2 to add Course");
            System.out.println("#  Enter 3 to add an Enrollment");
            System.out.println("#  Enter 4 to push an Enrollment");
            System.out.println("#  Enter 5 to get All Students");
            System.out.println("#  Enter 0 to exit");
            
            System.out.print("\n# Enter choice: ");
            choice = sc1.nextInt();
            sc1.nextLine();
            
            switch (choice) {
                case 0:
                    System.out.println("\n\n###################### QUIT ######################");
                    System.out.println("# Do you want to quit?");
                    System.out.println("#  Yes: 1");
                    System.out.println("#  No: 0");

                    System.out.print("# Choice: ");

                    if(sc1.nextInt() == 1)
                        exit = 0;

                    sc1.nextLine();
                    break;

                case 1:
                    createStudent(sc1, SService);
                    break;
            
                
                case 2:
                    createCourse(sc1, CService);
                    break;

                case 3:
                    createEnrollment(sc1, EService, CService, SService);
                    break;

                case 4:
                    pushEnrollment(sc1, EService);
                    break;

                case 5:
                    printStudents(SService);
                    break;
                    

                default:
                    System.out.println("# WIP");
                    break;
            }

        }

        System.out.println("\n\n# Quitting\n# Bye! :)");
        sc1.close();
    }
}
