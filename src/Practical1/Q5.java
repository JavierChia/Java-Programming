package Practical1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] agrc) {
        Scanner myObj = new Scanner(System.in);
        int i = 1;
        double newScore, aScore;
        double score = 0;
        newScore = score;

        while (score != -1) {
            System.out.print("Enter score #" + i + " (or enter -1 to stop) : ");
            score = myObj.nextInt();
            newScore += score;
            i += 1;
            if (score == -1) {
                newScore += 1;
            }
        }
        aScore = newScore / (i - 2);
        String grade;
        if (aScore >= 80) {
            grade = "A";
        } else if (aScore >= 70) {
            grade = "B";
        } else if (aScore >= 60) {
            grade = "C";
        } else if (aScore >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Average scores = " + String.format("%.2f", aScore) + " Grade = " + grade);

    }

}
