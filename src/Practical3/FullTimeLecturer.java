package Practical3;

public class FullTimeLecturer extends Lecturer{
    private String[] PTClass;
    private int[] classSize;
    private double salary ;
    
    public FullTimeLecturer (String name, int StaffID, String[] PTClass, int[] classSize, double salary) {
        super(name, StaffID);
        this.PTClass = PTClass;
        this.classSize = classSize;
        this.salary = salary;
    }
    
    public double calcMonthlyPay() {
        return salary;
    }
    
    public double calcPTLunchSubsidy() {
        int x  = 0;
        for (int i = 0; i < classSize.length; i++) {
            x += classSize[i]*10;
        } return x;
    }
}
