package Practical1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] agrc){
        Scanner myObj = new Scanner(System.in);
        int[] intArray = new int[5];
        int highest, value;
        String elements = "";

        highest = intArray[0];
        for (int i = 0; i < intArray.length;i++) {
            System.out.print("Enter value for intArray[" + i + "] -> ");
            value = myObj.nextInt();
            intArray[i] = value;
            if(intArray[i] > highest){
                highest = intArray[i];
            } elements += intArray [i] + " ";
        } System.out.println("\nElements of int array: " + elements + "\nHighest Element: " + highest);
    }
    
}

