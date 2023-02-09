package Practical3;




import Practical3.Student;
import Practical2.Lecturer;

public class PersonUser {
    public static void main(String[] args) {
        //declare and create a person object name p
        // and call greetings()
        Person p = new Person("Peter", 17);
        p.greetings();
        
        //declare and create a Student object named s
        Student s = new Student("JOE", 18 , "SOC");
        s.greetings();
        
        Lecturer lect = new Lecturer("John", 35, 5000.99);
        lect.greetings();
    }
    
}
