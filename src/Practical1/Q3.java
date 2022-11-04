package Practical1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your option:\n1) Metric Option\n2) Imperial\n>>");
        String option = myObj.nextLine();
        double BMI, weight, height;
        if (option.equals("1")) {
            System.out.print("Enter your weight in kilograms: ");
            weight = myObj.nextDouble();
            System.out.print("Enter your height in metres (e.g. 1.75): ");
            height = myObj.nextDouble();
        } else {
            System.out.print("Enter your weight in pounds: ");
            weight = myObj.nextDouble() * 703;
            System.out.print("Enter your height in inches: ");
            height = myObj.nextDouble();
        }
        BMI = weight / (height*height);
        String x;
        if (BMI<18.5) {
           x = "Underweight";
        } else if (BMI < 24.9) {
           x = "Normal";
        } else {
            x = "Overweight";
        }
        System.out.println("Your BMI is " + String.format("%.1f", BMI)+ " and you are " + x);

    }

}
