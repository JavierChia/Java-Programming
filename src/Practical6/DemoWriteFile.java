package Practical6;

import java.io.*;
import javax.swing.JOptionPane;

public class DemoWriteFile {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("abc.txt"));
            
            
            //generate random number between 50 and 150
            for(int i = 1; i <= 10; i++) {
                int num = 50 + (int)(Math.random()*101);
                System.out.println(num);
                pw.println("Number #" + (i) +": "+ num);
            }
            pw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in file writing...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }  
}
