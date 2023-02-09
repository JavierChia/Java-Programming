package Practical3;




public class Student extends Person {
    private String school;//default value is null
    
    //default contructor
    public Student() {
        
    }
    
   //overload constructor
    public Student(String name, int age, String school){
        super(name, age);
        this.school = school;
    }
    
    //get and set method
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school){
       
        this.school = school;
    }
    
    public void greetings() {
      System.out.println("Hi.. my name is " + getName() + " and i am " + getAge() + " years old.");
        System.out.println("I am a student with " + school);
  }

}
