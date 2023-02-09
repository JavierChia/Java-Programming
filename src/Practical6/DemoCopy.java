package Practical6;

import java.io.*;
import javax.swing.JOptionPane;

public class DemoCopy {

    public static void main(String[] args) {
        File inputFile = new File("numberdsAFEs.txt");
        File outputFile = new File("newNumbers.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

            String s;

            while ((s = br.readLine()) != null) {
                pw.println(s);
                System.out.println(s);
            }
            br.close();
            pw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
