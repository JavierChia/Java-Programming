package Practical1;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        String cHar = input.nextLine();
        if (cHar.length() > 1) {
            cHar = "*";
        }
        
        System.out.print("Input the size of the peak for the triangle: ");
        int siZe = input.nextInt();
        if (siZe > 10 || siZe<1) {
            siZe = 3;
        }
        String row;
        for (int i = 0; i <= siZe; i++) {
            row=cHar.repeat(i);
            System.out.println(row);
        } 
        for (int i = siZe-1; i>0; i--) {
            row = cHar.repeat(i);
            System.out.println(row);
        }
    }
}
