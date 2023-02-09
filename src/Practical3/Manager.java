package Practical3;




public class Manager extends Employee {
    private double profit;
    
    public Manager(String name, double bSalary, double profit) {
        super(name, bSalary);
        this.profit = profit;
    }
    
    public double calcSalary() {
        return getBaseSalary() + (0.1 * profit);
    }
    
}
