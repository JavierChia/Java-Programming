package Practical1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] agrc) {
        
        int input,seconds,minutes,hours;
        
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the total seconds: ");
        
        input = myObj.nextInt();
        
        hours = input / 3600;
        
        minutes = (input%3600)/60;
        
        seconds = input%60;
        
        System.out.println("\n     Time Convertor\n\nTotal Seconds: " + input + "\nHours:         " + hours + "\nMinutes:       " + minutes + "\nSeconds:       "+ seconds);
    }
}
