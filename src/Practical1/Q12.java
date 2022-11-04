package Practical1;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        int fBase, sBase, n, y, val;
        String table = "";

        System.out.print("Input the first base value for the multiplication table: ");
        fBase = newObj.nextInt();
        System.out.print("Input the last base value for the multiplication table: ");
        sBase = newObj.nextInt();

        for (n = 1; n <= 25; n++) {
            if (n <10 ) {
                table += " ";
            }
            table += n;
            
            for (y = fBase; y <= sBase; y++) {
                val = y * n;
                if (val < 10) {
                    table+="     ";
                } else if ( val < 100) {
                    table += "    ";
                } else {
                    table+= "   ";
                }
                table += val ;
                
            }
            table += "\n";
        }
        System.out.print(table);
    }

}

