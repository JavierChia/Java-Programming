package Practical1;

import java.util.Scanner;

public class Q11 {
    public static void main (String[] argc){
        Scanner myObj = new Scanner(System.in);
        String grade;
        int i = 1;
        double credU,gradenum,GPA,pts,Tpts;
        int tcredU = 0;
        gradenum = 0;
        Tpts = 0;
        
        do{
        
        System.out.print("Enter grade for module #"+ i +"(or enter 0 to stop) : ");
        grade = myObj.nextLine();
        
        if(grade.equals("A")) {
            gradenum = 4;
        } else if (grade.equals("B")) {
            gradenum = 3;
        } else if (grade.equals("C")) {
            gradenum = 2;
        } else if (grade.equals("D")) {
            gradenum = 1;
        }
        
        if (grade.equals("0")) {
            break;
        }
        
        System.out.print("Enter credit units for module #"+ i + ": ");
        credU = myObj.nextInt();
        myObj.nextLine();
        
        tcredU += credU;
        i++;
        
        pts = gradenum*credU;
        Tpts += pts;

        }while (!grade.equals("0"));
        
        GPA = Tpts/tcredU;
        
        System.out.println("\n\nYour total Credit units: " + tcredU +"\nYour GPA is " + String.format("%.2f", GPA));
    }
    
}