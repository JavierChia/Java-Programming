   package Practical3;

import Practical3.PartTimeLecturer;

public class LecturerUser {

    public static void main(String[] args) {
        Lecturer[] lecArray = new Lecturer[4];
        lecArray[0] = new FullTimeLecturer(
                "John", 1, new String[]{"1A / 01", "1A / 02"},
                new int[]{20, 22}, 3500);
        lecArray[1] = new FullTimeLecturer(
                "Jack", 2, new String[]{"1B / 01", "1B / 02"},
                new int[]{25, 22}, 4000);
        lecArray[2] = new PartTimeLecturer("Joe", 11, 60, 60);
        lecArray[3] = new PartTimeLecturer("Janny", 12, 60, 45);
        
        for (int i = 0; i < lecArray.length; i++) {
            System.out.println("The monthly pay for Lecturer " + lecArray[i].getName() + " is $" + lecArray[i].calcMonthlyPay());
        }
    }
    
    
}
