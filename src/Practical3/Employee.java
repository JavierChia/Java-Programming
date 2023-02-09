package Practical3;

public abstract class Employee {
    private String name;
    private double bSalary;
    
    public Employee (String name, double bSalary){
        this.name = name;
        this.bSalary = bSalary;
    }
    public double getBaseSalary(){
        return bSalary;
    }
    public String getName(){
        return name;
    }
    public abstract double calcSalary();
}
