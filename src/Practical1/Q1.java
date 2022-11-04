package Practical1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter MST score: ");
        var mst = myObj.nextDouble(); 
        System.out.print("Enter Assignment 1 Score: ");
        var ass1 = myObj.nextDouble();
        System.out.print("Enter Assignment 2 score: ");
        var ass2 = myObj.nextDouble(); 
        System.out.print("Enter Group Project Score: ");
        var gp= myObj.nextDouble();
        
        double finalScore = mst*0.2 + ass1*0.25 + ass2*0.35 + gp*0.2;
        
        System.out.println("Your final scores : " +  String.format("%.2f", finalScore));
    }
}
