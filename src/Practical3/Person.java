package Practical3;




public class Person {
  private String name; //default value is null
  private int age; //default value is 0
  
  //default constructor
  public Person() {}
  //overload constructor
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }
  //get and set methods
  public String getName() {
      return name;
  }
  
  public int getAge() {
      return age;
  }
  
  public void setName (String name)  {
      this.name = name;
  }
  
  public void setAge (int age) {
      this.age = age;
  }
  
  public void greetings() {
      System.out.println("Hi.. my name is " + name + " and i am " + age + " years old.");
  }
}

