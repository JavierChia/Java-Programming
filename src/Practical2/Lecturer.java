package Practical2;

import Practical3.Person;

public class Lecturer extends Person {

    private String name;
    private double salary;

    public Lecturer() {
    }

    ;
    public Lecturer(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void greetings() {
        System.out.println("HI my name is " + getName());
    }
}
