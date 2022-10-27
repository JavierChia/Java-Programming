package Practical1;

import java.util.Scanner;

public class Q1 { //Start of Q1 class
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter MST score: ");
        var mst = myObj.nextInt(); 
        System.out.print("Enter Assignment 1 Score: ");
        var ass1 = myObj.nextInt();
        System.out.print("Enter Assignment 2 score: ");
        var ass2 = myObj.nextDouble(); 
        System.out.print("Enter Group Project Score: ");
        var gp= myObj.nextDouble();
        
        final double finalScore = mst*0.2 + ass1*0.25 + ass2*0.35 + gp*0.2;
        
        System.out.println("Your final scores : " +  finalScore);
    }
} //End of Q1 class

