package Practical3;

public class PartTimeLecturer extends Lecturer {

    private double hourlyRate;
    private double monthlyHours;

    public PartTimeLecturer(String name, int StaffID, double hourlyRate, double monthlyHours) {
        super(name, StaffID);
        this.hourlyRate = hourlyRate;
        this.monthlyHours = monthlyHours;
    }

    public double calcMonthlyPay() {
        return hourlyRate * monthlyHours;
    }
}
