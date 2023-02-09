package Practical3;

public class Lecturer {

    private String name;
    private int StaffID;

    public Lecturer() {
    }

    public Lecturer(String name, int StaffID) {
        this.name = name;
        this.StaffID = StaffID;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double calcMonthlyPay(){
        return 0;
    }
}
