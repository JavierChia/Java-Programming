package Practical6;

import java.io.*;
import javax.swing.JOptionPane;

public class DemoReadFile {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));

            String s;

            while ((s = br.readLine()) != null)
                System.out.println(s);
            
            br.close(); //close the file input stream

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error in file reading...", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
