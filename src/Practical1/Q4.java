package Practical1;

import javax.swing.JOptionPane;

public class Q4 {
     public static void main(String[] args) {
         int value;
         value = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value:"));
         while (value<1 || value >10) {
             JOptionPane.showMessageDialog(null,"Out of range! Please enter a number between 1 and 10!", "ERROR",JOptionPane.ERROR_MESSAGE);
             value = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value:"));
         }
         String[] RNV = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
         JOptionPane.showMessageDialog(null, "Roman Numeric Value = " + RNV[value-1]);
     }
}
